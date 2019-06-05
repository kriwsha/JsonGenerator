package bva.json;

import bva.json.generators.DataGenerator;
import bva.json.generators.Generator;

public class Application {

    public static void main(String[] args) {
        Generator generator = new DataGenerator();

        String template = "{\n" +
                "  \"name\": \"name()\",\n" +
                "  \"date of birth\": \"date()\",\n" +
                "  \"e-mail\": \"email()\",\n" +
                "  \"phone\": \"phone()\",\n" +
                "  \"currency\": \"currency()\"\n" +
                "}";

        generator.generate(template, 10);
    }
}
