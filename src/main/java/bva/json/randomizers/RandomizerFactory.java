package bva.json.randomizers;

/**
 * Factory for randomizer creation
 */
public class RandomizerFactory {

    public static Class<? extends RandomValue> getRandomValueByName(String name) throws ClassNotFoundException {
        TypesEnum typesEnum = TypesEnum.valueOf(name);
        return typesEnum.getClassRandom();
    }
}
