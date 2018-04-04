package bva.json.context;

import java.util.HashMap;
import java.util.Map;

public class JsonGenerator {
    private Map<String, ?> template;

    public JsonGenerator(Map<String, ?> template) {
        this.template = template;
    }

    public synchronized String generateJson() {
        Map<String, String> result = new HashMap<>();
        template.forEach((k, v) -> result.put(k, generateData(v.toString())));
        return result.toString();
    }

    private String generateData(String funcName) {
        return "";
    }
}