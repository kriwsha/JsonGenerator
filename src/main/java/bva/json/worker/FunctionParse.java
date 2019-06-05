package bva.json.worker;


import java.util.stream.Stream;

class FunctionParse {

    RandomInitializer parseFunction(String function) {
        String[] splited = function.split("\\(");
        String functionName = splited[0];

        RandomInitializer initializer = new RandomInitializer()
                .withName(functionName);

        String parameterString = splited[1]
                .replace("(", "")
                .replace(")", "")
                .trim();

        Stream.of(parameterString.split(",")).forEach(initializer::addParameter);

        return initializer;
    }
}
