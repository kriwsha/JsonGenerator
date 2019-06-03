package bva.json.randomizers;

import java.util.Random;

/**
 * ...
 */
public abstract class RandomValue {
    protected Random RANDOM = new Random();

    public abstract String next();
}
