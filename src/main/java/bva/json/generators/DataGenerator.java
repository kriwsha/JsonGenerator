package bva.json.generators;

import bva.json.context.JsonGenerator;
import bva.json.context.Template;
import bva.json.context.WorkToken;
import bva.json.exceptions.DoubleWorkException;
import bva.json.writers.MultiThreadFileWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class DataGenerator implements Generator{
    private WorkToken token = WorkToken.getInstance();

    @Override
    public void generate(String jsonTemplate, int count) {
        try {
            Template template = new Template(jsonTemplate);

            if(token.isWorking()) {
                throw new DoubleWorkException("utility is working now");
            } else {
                token.startWorking();
            }
            int threadCount = String.valueOf(count>99 ? count : 1).length();
            ExecutorService executor = Executors.newFixedThreadPool(threadCount);
            List<Callable<Object>> tasks = new ArrayList<>();

            for (int i=0; i<threadCount; i++) {
                int countForThread = count / threadCount;
                if (i == 0) {
                    countForThread += count % threadCount;
                }
                tasks.add(Executors.callable(new Worker(template.getTemplate(), countForThread)));
            }
            executor.invokeAll(tasks);
            executor.shutdown();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            token.stopWorking();
        }
    }

    class Worker implements Runnable {
        private JsonGenerator jsonGenerator;
        private MultiThreadFileWriter fileWriter = MultiThreadFileWriter.getInstance();
        private int count;

        Worker(Map<String, ?> template, int count) {
            this.jsonGenerator = new JsonGenerator(template);
            this.count = count;
        }

        @Override
        public void run() {
            while(--count >= 0) {
                String json = jsonGenerator.generateJson();
                fileWriter.writeToFile(json);
            }
        }
    }
}
