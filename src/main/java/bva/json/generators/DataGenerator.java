package bva.json.generators;

import bva.json.worker.JsonGenerator;
import bva.json.worker.Template;
import bva.json.worker.WorkToken;
import bva.json.exceptions.DoubleWorkException;
import bva.json.randomizers.RandomValue;
import bva.json.writers.MultiThreadFileWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class DataGenerator implements Generator {
    private WorkToken token = WorkToken.getInstance();
    private MultiThreadFileWriter fileWriter = MultiThreadFileWriter.getInstance();

    @Override
    public void generate(String jsonTemplate, int count) {
        try {
            Template template = new Template(jsonTemplate);

            if (token.isWorking()) {
                throw new DoubleWorkException("utility is working now");
            } else {
                token.startWorking();
            }
            int threadCount = count < 1000 ? 1 : count % 1000;

            if (threadCount > 1) {
                ExecutorService executor = Executors.newFixedThreadPool(threadCount);
                List<Callable<Object>> tasks = new ArrayList<>();

                for (int i = 0; i < threadCount; i++) {
                    int countForThread = count / threadCount;
                    if (i == 0) {
                        countForThread += count % threadCount;
                    }
                    tasks.add(Executors.callable(
                            new Worker(template.getTemplate(), countForThread)));
                }
                executor.invokeAll(tasks);
                executor.shutdown();
            } else {
                Worker worker = new Worker(template.getTemplate(), count);
                worker.run();
            }
            fileWriter.flushBuffer();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            token.stopWorking();
        }
    }

    class Worker implements Runnable {
        private JsonGenerator jsonGenerator;
        private int count;

        Worker(Map<String, RandomValue> template, int count) {
            this.jsonGenerator = new JsonGenerator(template);
            this.count = count;
        }

        @Override
        public void run() {
            while (--count >= 0) {
                String json = jsonGenerator.generateJson();
                fileWriter.write(json);
                System.out.println(json);
            }
        }
    }
}
