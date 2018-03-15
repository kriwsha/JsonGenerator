package bva.json.generators;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class JsonGenerator implements Generator{

    @Override
    public void generate(int jsonCount) {
        try {
            int threadCount = String.valueOf(jsonCount>9 ? (jsonCount-1) : 1).length();
            ExecutorService executor = Executors.newFixedThreadPool(threadCount);
            List<Callable<Object>> tasks = new ArrayList<>();

            for (int i=0; i<threadCount; i++)
                tasks.add(Executors.callable(new Worker()));

            executor.invokeAll(tasks);

            executor.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    class Worker implements Runnable {
        @Override
        public void run() {



        }
    }
}
