package bva.json.context;

import bva.json.exceptions.NoFunctionFoundException;

import java.util.stream.Stream;

public enum FunctionType {
    DATE,
    BOOL;

    private FunctionType findByName(String functionName) throws NoFunctionFoundException {
        return Stream.of(values())
                .filter(f -> f.name().equals(functionName))
                .findFirst().orElseThrow(NoFunctionFoundException::new);
    }
}
