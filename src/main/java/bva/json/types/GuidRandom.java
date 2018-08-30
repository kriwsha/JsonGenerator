package bva.json.types;

import java.util.UUID;

public class GuidRandom extends Randomizer {
    public String next() {
        return UUID.randomUUID().toString();
    }
}
