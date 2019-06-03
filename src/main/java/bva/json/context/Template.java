package bva.json.context;

import bva.json.randomizers.RandomValue;
import bva.json.randomizers.RandomizerFactory;
import org.json.JSONObject;
import org.json.JSONWriter;

import java.util.HashMap;
import java.util.Map;

public class Template {
    private Map<String, Class<? extends RandomValue>> template;

    public Template(String template) {
        this.template = createTemplate(template);
    }

    private Map<String, Class<? extends RandomValue>> createTemplate(String template) {
        JSONObject jsonObject = new JSONObject(template);

        Map<String, Class<? extends RandomValue>> result = new HashMap<>();
        jsonObject.keySet().forEach(key -> {
            try {
                result.put(key, RandomizerFactory.getRandomValueByName(key));
            } catch (ClassNotFoundException e) {
                System.out.println(e);
            }
        });
        return result;
    }

    public Map<String, Class<? extends RandomValue>> getTemplate() {
        return template;
    }
}
