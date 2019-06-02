package bva.json.randomizers;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Random E-mail address
 */
class EmailRandom extends RandomValue {
    private String[] domains = {"com", "org", "ru", "uk", "de", "ua"};

    @Override
    public String next() {
        StringBuilder email = new StringBuilder();
        int nameLen = ThreadLocalRandom.current().nextInt(4, 10);
        email.append(
                new StringRandom(nameLen).next())
                .append("@")
                .append(new RandomWord(4, 6)
                        .next())
                .append(".")
                .append(domains[RANDOM.nextInt(domains.length)]);
        return email.toString();
    }


}
