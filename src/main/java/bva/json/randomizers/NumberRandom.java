package bva.json.randomizers;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Random number
 */
class NumberRandom extends RandomValue{
    private int from;
    private int to;

    public String next() {
        return String.valueOf(ThreadLocalRandom.current().nextInt(from, to));
    }

    public NumberRandom() {
        this(1, 100);
    }

    public NumberRandom(int from, int to) {
        this.from = from;
        this.to = to;
    }
}
