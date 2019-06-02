package bva.json.randomizers;

import java.util.UUID;

public class GuidRandom {
    public String next() {
        return UUID.randomUUID().toString();
    }
}
