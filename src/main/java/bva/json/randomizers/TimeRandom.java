package bva.json.randomizers;

import java.sql.Time;

public class TimeRandom extends RandomValue implements Randomizer {

    @Override
    public String next() {
        return new Time(Integer.toUnsignedLong(random.nextInt(24 * 60 * 60 * 1000))).toString();
    }
}
