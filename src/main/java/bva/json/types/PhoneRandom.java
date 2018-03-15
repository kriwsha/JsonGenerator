package bva.json.types;

import java.util.Random;

public class PhoneRandom {
    private final char[] chars = "1234567890".toCharArray();

    public String next() {
        Random random = new Random();
        StringBuilder phone = new StringBuilder();
        phone.append("+").append(chars[random.nextInt(chars.length-1)]).append("(");
        for (int i=1; i<=3; i++)
            phone.append(chars[random.nextInt(chars.length-1)]);
        phone.append(")");
        for (int i=1; i<=4; i++)
            phone.append(chars[random.nextInt(chars.length-1)]);
        return phone.toString();
    }
}
