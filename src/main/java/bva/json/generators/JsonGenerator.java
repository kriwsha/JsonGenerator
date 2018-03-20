package bva.json.generators;

import bva.json.context.Template;
import bva.json.context.WorkToken;
import bva.json.exceptions.DoubleWorkException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.*;

public class JsonGenerator implements Generator{
    private WorkToken token = WorkToken.getInstance();
    private Template template;

    @Override
    public void generate(String template, int count) {
        try {
            this.template = new Template(template);

            if(token.isWorking())
                throw new DoubleWorkException("utility is working now");
            else
                token.startWorking();
            int threadCount = String.valueOf(count>99 ? (count-1) : 1).length();
            ExecutorService executor = Executors.newFixedThreadPool(threadCount);
            List<Callable<Object>> tasks = new ArrayList<>();

            for (int i=0; i<threadCount; i++)
                tasks.add(Executors.callable(new Worker()));

            executor.invokeAll(tasks);

            executor.shutdown();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            token.stopWorking();
        }
    }


    class Worker implements Runnable {
        private HashMap<String, Object> jsonMap = new HashMap<>();
        @Override
        public void run() {



        }
    }
}
