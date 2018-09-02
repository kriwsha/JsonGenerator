package bva.json.context;

import bva.json.randomizers.DateRandom;
import bva.json.randomizers.Randomizer;

import java.util.function.Function;
import java.util.stream.Stream;

public enum FunctionType {
    DATE("date", DateRandom::init);


    private String name;
    private Function<String, Randomizer> engine;

    FunctionType(String name, Function<String, Randomizer> engine) {
        this.name = name;
        this.engine = engine;
    }

    private FunctionType findByName(String functionName) {
        return Stream.of(values())
                .filter(f -> f.name.equals(functionName))
                .findFirst().get();
    }

    public Randomizer getRandomizer(String functionName) {
        return findByName(functionName)
                .engine
                .apply(functionName);
    }
}
