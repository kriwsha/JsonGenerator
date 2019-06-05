package bva.json.writers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class MultiThreadFileWriter {

    private static final String FILE_NAME = "result.txt";
    private CopyOnWriteArrayList<String> buffer = new CopyOnWriteArrayList<>();
    private static volatile MultiThreadFileWriter instance;
    private AtomicBoolean canWriteToArray = new AtomicBoolean(true);
    private File file;


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
        try {
            file = new File(FILE_NAME);
            boolean exists = file.exists() || file.createNewFile();
            if (!exists) {
                throw new Exception(String.format("file \"%s\" doesn't exist or wasn't created", FILE_NAME));
            }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    private synchronized void writeIntoFile() {
        try {
            FileWriter writer = new FileWriter(file, true);
            buffer.forEach(x -> {
                try {
                    writer.write(x + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            buffer.clear();
        }
    }

    public synchronized void write(String json) {
        if (this.canWriteToArray.get()) {
            if (buffer.size() >= 100) {
                writeIntoFile();
            }
            buffer.add(json);
        }
    }

    public synchronized void flushBuffer() {
        this.canWriteToArray.set(false);
        writeIntoFile();
    }
}
