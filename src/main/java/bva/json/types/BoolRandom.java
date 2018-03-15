package bva.json.types;

import java.util.Random;

public class BoolRandom {
    public boolean next() {
        return new Random().nextBoolean();
    }
}
