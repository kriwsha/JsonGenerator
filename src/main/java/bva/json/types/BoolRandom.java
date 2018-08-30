package bva.json.types;

public class BoolRandom extends Randomizer {
    public boolean next() {
        return random.nextBoolean();
    }
}
