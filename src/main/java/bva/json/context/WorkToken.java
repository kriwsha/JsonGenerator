package bva.json.context;

public class WorkToken {
    private static WorkToken instance;
    private boolean isWorking = false;

    public static WorkToken getInstance() {
        if (instance==null)
            instance = new WorkToken();
        return instance;
    }

    private WorkToken() {
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void startWorking() {
        isWorking = true;
    }

    public void stopWorking() {
        isWorking = false;
    }
}
