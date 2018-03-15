package bva.json.context;

public class WorkToken {
    private static WorkToken ourInstance = new WorkToken();

    public static WorkToken getInstance() {
        return ourInstance;
    }

    private WorkToken() {
    }
}
