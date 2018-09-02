package bva.json.randomizers;

import java.util.UUID;

public class GuidRandom extends RandomValue {
    public String next() {
        return UUID.randomUUID().toString();
    }
}
