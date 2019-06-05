package bva.json.context;

import bva.json.randomizers.RandomValue;
import bva.json.randomizers.RandomizerFactory;
import org.json.JSONObject;
import org.json.JSONWriter;

import java.util.HashMap;
import java.util.Map;

public class Template {
    private Map<String, RandomValue> template;
    private FunctionParse parser;

    public Template(String template) {
        this.template = createTemplate(template);
        this.parser = new FunctionParse();
    }

    private Map<String, RandomValue> createTemplate(String template) {
        JSONObject jsonObject = new JSONObject(template);

        Map<String, RandomValue> result = new HashMap<>();
        jsonObject.keySet().forEach(key -> {
            try {
                String functionValue = jsonObject.getString(key);
                RandomInitializer initializer = parser.parseFunction(functionValue);
                RandomValue randomizer = RandomizerFactory.getRandomValueByName(initializer);
                result.put(key, randomizer);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });
        return result;
    }

    public Map<String, RandomValue> getTemplate() {
        return template;
    }

}
