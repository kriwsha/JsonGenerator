package bva.json.randomizers;

import bva.json.worker.RandomInitializer;

import java.util.Map;

/**
 * Factory for randomizer creation
 */
public class RandomizerFactory {

    public static RandomValue getRandomValueByName(RandomInitializer initializer) throws ClassNotFoundException {
        TypesEnum typesEnum = TypesEnum.valueOf(initializer.getName().toUpperCase());

        Class<? extends RandomValue> classRandom = typesEnum.getClassRandom();

        // TODO: 05.06.19 Заменить этот костыль
        // TODO: 05.06.19 Добавить создание с параметрами конструктора для всех
        // TODO: 05.06.19 В мапу с параметрами даже при их отсутствии мы кладем пустую строку!!!
        String clazzName = classRandom.getName();
        if (clazzName.equals(CurrencyRandom.class.getName())) {
            return new CurrencyRandom();
        }
        if (clazzName.equals(DateRandom.class.getName())) {
            return new DateRandom();
        }
        if (clazzName.equals(DateTimeRandom.class.getName())) {
            return new DateTimeRandom();
        }
        if (clazzName.equals(EmailRandom.class.getName())) {
            return new EmailRandom();
        }
        if (clazzName.equals(GuidRandom.class.getName())) {
            return new GuidRandom();
        }
        if (clazzName.equals(NameRandom.class.getName())) {
            return new NameRandom();
        }
        if (clazzName.equals(NumberRandom.class.getName())) {
            return new NumberRandom();
        }
        if (clazzName.equals(PhoneRandom.class.getName())) {
            return new PhoneRandom();
        }
        if (clazzName.equals(RandomWord.class.getName())) {
            return new RandomWord();
        }
        if (clazzName.equals(StringRandom.class.getName())) {
            return new StringRandom();
        }
        if (clazzName.equals(TextRandom.class.getName())) {
            return new TextRandom();
        }
        if (clazzName.equals(TimeRandom.class.getName())) {
            return new TimeRandom();
        }
        if (clazzName.equals(WebSiteRandom.class.getName())) {
            return new WebSiteRandom();
        }

        return new RandomWord();
    }

}
