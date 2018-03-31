package bva.json.writers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MultiThreadFileWriter {
    private static volatile MultiThreadFileWriter instance;
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
            file = new File("result.txt");
            boolean exists = file.exists() || file.createNewFile();
            if (!exists)
                throw new Exception("file \"result.txt\" doesn't exist or wasn't created");
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    public synchronized void writeToFile(String json) {
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(json + "\r");
            writer.close();
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
