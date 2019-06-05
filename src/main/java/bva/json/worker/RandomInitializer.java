package bva.json.worker;

import java.util.HashMap;
import java.util.Map;

public class RandomInitializer {
    private String name;
    private Map<Integer, String> parameters = new HashMap<>();

    private static Integer counter = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RandomInitializer withName(String name) {
        this.name = name;
        return this;
    }

    public Map<Integer, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<Integer, String> parameters) {
        this.parameters = parameters;
    }

    public RandomInitializer withParameters(Map<Integer, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public RandomInitializer addParameter(String parameter) {
        this.parameters.put(counter, parameter);
        counter++;
        return this;
    }
}