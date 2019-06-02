package bva.json.randomizers;

import java.util.concurrent.ThreadLocalRandom;

public class NumberRandom {
    private int from;
    private int to;

    public int next() {
        return ThreadLocalRandom.current().nextInt(from, to);
    }

    public NumberRandom() {
        this(1, 100);
    }

    public NumberRandom(int from, int to) {
        this.from = from;
        this.to = to;
    }
}
