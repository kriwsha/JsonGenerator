package bva.json.types;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class EmailRandom implements RandomStrObj {
    private String[] domains = {"com", "org", "ru", "uk", "de", "ua"};
    private Random random = new Random();

    @Override
    public String next() {
        StringBuilder email = new StringBuilder();
        int nameLen = ThreadLocalRandom.current().nextInt(4, 10);
        email.append(new StringRandom(nameLen).next()).append("@").append(new RandomWord(4, 6).next()).append(".").append(domains[random.nextInt(domains.length)]);
        return email.toString();
    }


}
