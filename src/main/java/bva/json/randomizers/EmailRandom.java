package bva.json.randomizers;

import java.util.concurrent.ThreadLocalRandom;

public class EmailRandom extends Randomizer implements RandomStrObj {
    private String[] domains = {"com", "org", "ru", "uk", "de", "ua"};

    @Override
    public String next() {
        StringBuilder email = new StringBuilder();
        int nameLen = ThreadLocalRandom.current().nextInt(4, 10);
        email.append(new StringRandom(nameLen).next()).append("@").append(new RandomWord(4, 6).next()).append(".").append(domains[random.nextInt(domains.length)]);
        return email.toString();
    }


}
