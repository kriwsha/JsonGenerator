package bva.json.context;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class JsonGenerator {
    private Map<String, ?> template;
    private FunctionParser functionParser;

    public JsonGenerator(Map<String, ?> template) {
        this.template = template;
        this.functionParser = new FunctionParser();
    }

    public synchronized String generateJson() {
        Map<String, String> result = new HashMap<>();
        template.forEach((k, v) -> result.put(k, generateData(v.toString())));
        return generateFinalJson(result);
    }

    private String generateData(String functionName) {
        try {
            Method function = functionParser.getMethod(functionName);
            Class<?> clazz = FunctionType.valueOf(functionName).getType().getClassRandom();
            return function.invoke(clazz).toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private String generateFinalJson(Map<String, String> result) {
        return "";
    }
}
