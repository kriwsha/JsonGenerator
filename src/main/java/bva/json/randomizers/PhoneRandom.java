package bva.json.randomizers;

public class PhoneRandom extends RandomValue implements Randomizer {
    private final char[] chars = "1234567890".toCharArray();

    public String next() {
        StringBuilder phone = new StringBuilder();
        phone.append("+").append(chars[random.nextInt(chars.length - 1)]).append(" (");
        for (int i = 1; i <= 7; i++) {
            if (i == 4)
                phone.append(") ");
            phone.append(chars[random.nextInt(chars.length - 1)]);
        }
        return phone.toString();
    }
}
