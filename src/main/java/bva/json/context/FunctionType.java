package bva.json.context;

import bva.json.types.DateRandom;

import java.util.function.Function;
import java.util.stream.Stream;

public enum FunctionType {
    DATE("date", (s -> new DateRandom(s).next()));


    private String name;
    private Function<String, String> engine;

    FunctionType(String name, Function<String, String> engine) {
        this.name = name;
        this.engine = engine;
    }

    public Function<String, String> getEngine() {
        return engine;
    }

    public FunctionType findByName(String functionName) throws Exception {
        return Stream.of(values())
                .filter(f -> f.name.equals(functionName))
                .findFirst().get();
    }
}
