package bva.json.types;

public class WebSiteRandom extends Randomizer implements RandomStrObj {
    private final String prefix = "http://www.";
    private RandomWord word = new RandomWord(5, 10);
    private String[] domains = {"com", "org", "ru", "uk", "de", "ua"}; //TODO: объединить emailrandom и websiterandom

    @Override
    public String next() {
        return String.format("%s%s.%s", prefix, word.next(), domains[random.nextInt(domains.length)]);
    }
}
