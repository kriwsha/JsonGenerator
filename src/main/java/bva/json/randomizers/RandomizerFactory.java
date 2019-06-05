package bva.json.randomizers;

import bva.json.context.RandomInitializer;

import java.util.Map;

/**
 * Factory for randomizer creation
 */
public class RandomizerFactory {

    public static RandomValue getRandomValueByName(RandomInitializer initializer) throws ClassNotFoundException {
        TypesEnum typesEnum = TypesEnum.valueOf(initializer.getName());

        Class<? extends RandomValue> classRandom = typesEnum.getClassRandom();

        // TODO: 05.06.19 Заменить этот костыль
        String clazzName = classRandom.getName();
        if (clazzName.equals(CurrencyRandom.class.getName())) {
            return new CurrencyRandom();
        }
        if (clazzName.equals(DateRandom.class.getName())) {
            return createDateRandom(initializer.getParameters());
        }




        return null;
    }

    private static DateRandom createDateRandom(Map<Integer, String> parameter) {
        if (parameter.isEmpty()) {
            return new DateRandom();
        } else {
            int yearFrom = Integer.parseInt(parameter.get(0));
            int yearTo = Integer.parseInt(parameter.get(1));

            return new DateRandom(yearFrom, yearTo);
        }
    }


}
