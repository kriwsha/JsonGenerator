package bva.json.writers;

public class MultiThreadFileWriter {
    private static volatile MultiThreadFileWriter instance;

    public static MultiThreadFileWriter getInstance() {
        MultiThreadFileWriter local = instance;
        if (local == null) {
            synchronized (MultiThreadFileWriter.class) {
                local = instance;
                if (local == null) {
                    instance = local = new MultiThreadFileWriter();
                }
            }
        }
        return local;
    }

    private MultiThreadFileWriter() {
    }

    public synchronized void writeToFile() {

    }
}
