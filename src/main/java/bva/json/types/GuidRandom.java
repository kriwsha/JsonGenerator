package bva.json.types;

import java.util.UUID;

public class GuidRandom {
    public String next() {
        return UUID.randomUUID().toString();
    }
}
