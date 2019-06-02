package bva.json.context;

import bva.json.exceptions.NoFunctionFoundException;
import bva.json.randomizers.RandomValue;

import java.util.function.Function;
import java.util.stream.Stream;

public enum FunctionType {
    DATE("date", null),
    BOOL("bool", null);


    private String name;
    private Function<String, RandomValue> engine;

    FunctionType(String name, Function<String, RandomValue> engine) {
        this.name = name;
        this.engine = engine;
    }

    private FunctionType findByName(String functionName) throws NoFunctionFoundException {
        return Stream.of(values())
                .filter(f -> f.name.equals(functionName))
                .findFirst().orElseThrow(NoFunctionFoundException::new);
    }

    public RandomValue getRandomizer(String functionName) throws NoFunctionFoundException {
        return findByName(functionName)
                .engine
                .apply(functionName);
    }
}
