package bva.json.randomizers;

import java.sql.Time;

public class TimeRandom extends Randomizer implements RandomStrObj {

    @Override
    public String next() {
        return new Time(Integer.toUnsignedLong(random.nextInt(24 * 60 * 60 * 1000))).toString();
    }
}