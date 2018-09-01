package bva.json.randomizers;

public class BoolRandom extends Randomizer {
    public boolean next() {
        return random.nextBoolean();
    }
}
