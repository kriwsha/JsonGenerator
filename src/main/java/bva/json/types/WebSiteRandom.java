package bva.json.types;

import java.util.Random;

public class WebSiteRandom implements RandomStrObj {
    private Random random = new Random();
    private String prefix = "http://www.";
    private RandomWord word = new RandomWord(5, 10);
    private String[] domains = {"com", "org", "ru", "uk", "de", "ua"}; //TODO: объединить emailrandom и websiterandom


    @Override
    public String next() {
        StringBuilder web = new StringBuilder();
        web.append(prefix).append(word.next()).append(".").append(domains[random.nextInt(domains.length)]);
        return web.toString();
    }
}
