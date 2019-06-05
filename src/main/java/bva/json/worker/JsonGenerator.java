package bva.json.worker;

import bva.json.randomizers.RandomValue;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonGenerator {
    private Map<String, RandomValue> template;

    public JsonGenerator(Map<String, RandomValue> template) {
        this.template = template;
    }

    public synchronized String generateJson() {
        Map<String, String> result = new HashMap<>();
        template.forEach((k, v) -> result.put(k, v.next()));
        return new JSONObject(result).toString();
    }
}
