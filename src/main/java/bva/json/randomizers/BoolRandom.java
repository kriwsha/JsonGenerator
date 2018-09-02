package bva.json.randomizers;

public class BoolRandom extends RandomValue {

    private String first;
    private String second;

    BoolRandom(String first, String second) {
        this.first = first;
        this.second = second;
    }

    BoolRandom() {
        this.first = "true";
        this.second = "second";
    }

    public String next() {
        return random.nextBoolean()
                ? first
                : second;
    }

}
