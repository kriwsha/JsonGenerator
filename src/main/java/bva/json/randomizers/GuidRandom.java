package bva.json.randomizers;

import java.util.UUID;

/**
 * Random identifier
 */
class GuidRandom extends RandomValue {
    public String next() {
        return UUID.randomUUID().toString();
    }
}
