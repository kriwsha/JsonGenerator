package bva.json.context;

public class Entry <T> {
    private String key;
    private T value;

    public Entry (String key, T value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }
}
