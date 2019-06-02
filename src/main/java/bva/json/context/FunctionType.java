package bva.json.context;

import bva.json.randomizers.DateRandom;
import bva.json.randomizers.RandomValue;

import java.util.function.Function;
import java.util.stream.Stream;

public enum FunctionType {
    DATE("date", DateRandom::init),
    BOOL("bool", null);


    private String name;
    private Function<String, RandomValue> engine;

    FunctionType(String name, Function<String, RandomValue> engine) {
        this.name = name;
        this.engine = engine;
    }

    private FunctionType findByName(String functionName) {
        return Stream.of(values())
                .filter(f -> f.name.equals(functionName))
                .findFirst().get();
    }

    public RandomValue getRandomizer(String functionName) {
        return findByName(functionName)
                .engine
                .apply(functionName);
    }
}
