package bva.json.randomizers;

import java.util.UUID;

public class GuidRandom extends Randomizer {
    public String next() {
        return UUID.randomUUID().toString();
    }
}
