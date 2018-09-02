package bva.json.randomizers;

public class WebSiteRandom extends RandomValue implements Randomizer {
    private final String prefix = "http://www.";
    private RandomWord word = new RandomWord(5, 10);
    private String[] domains = {"com", "org", "ru", "uk", "de", "ua"};

    @Override
    public String next() {
        return String.format("%s%s.%s", prefix, word.next(), domains[random.nextInt(domains.length)]);
    }
}
