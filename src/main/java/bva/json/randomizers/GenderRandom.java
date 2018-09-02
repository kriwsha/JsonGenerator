package bva.json.randomizers;


public class GenderRandom extends RandomValue implements Randomizer {
    private String man;
    private String woman;

    public GenderRandom() {
        this("m", "w");
    }

    public GenderRandom(String man, String woman) {
        this.man = man;
        this.woman = woman;
    }

    @Override
    public String next() {
        return random.nextBoolean()? man : woman;
    }
}
