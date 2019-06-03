package bva.json.randomizers;

/**
 * Random phone number
 */
class

PhoneRandom extends RandomValue {
    private final char[] chars = "1234567890".toCharArray();

    public String next() {
        StringBuilder phone = new StringBuilder();
        phone.append("+").append(chars[RANDOM.nextInt(chars.length - 1)]).append(" (");
        for (int i = 1; i <= 7; i++) {
            if (i == 4)
                phone.append(") ");
            phone.append(chars[RANDOM.nextInt(chars.length - 1)]);
        }
        return phone.toString();
    }
}
