package bva.json.randomizers;

/**
 * Random web site address
 */
class WebSiteRandom extends RandomValue {
    private final String prefix = "http://www.";
    private RandomWord word = new RandomWord(5, 10);
    private String[] domains = {"com", "org", "ru", "uk", "de", "ua"};

    @Override
    public String next() {
        return String.format("%s%s.%s", prefix, word.next(), domains[RANDOM.nextInt(domains.length)]);
    }
}
