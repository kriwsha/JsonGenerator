package bva.json.context;

import bva.json.randomizers.RandomValue;
import bva.json.randomizers.RandomizerFactory;
import org.json.JSONObject;
import org.json.JSONWriter;

import java.util.HashMap;
import java.util.Map;

public class Template {
    private Map<String, Class<? extends RandomValue>> template;
    private FunctionParse parser;

    public Template(String template) {
        this.template = createTemplate(template);
        this.parser = new FunctionParse();
    }

    private Map<String, Class<? extends RandomValue>> createTemplate(String template) {
        JSONObject jsonObject = new JSONObject(template);

        Map<String, Class<? extends RandomValue>> result = new HashMap<>();
        jsonObject.keySet().forEach(key -> {
            try {
                String functionValue = jsonObject.getString(key);
                RandomInitializer initializer = parser.parseFunction(functionValue);

                Class<? extends RandomValue> randomizerClass = RandomizerFactory.getRandomValueByName(initializer);




                result.put(key, randomizerClass);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });
        return result;
    }

    public Map<String, Class<? extends RandomValue>> getTemplate() {
        return template;
    }


}
