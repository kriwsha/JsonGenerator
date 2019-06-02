package bva.json.randomizers;

import java.sql.Time;

/**
 * Random time value
 */
class TimeRandom extends RandomValue {

    @Override
    public String next() {
        return new Time(Integer.toUnsignedLong(RANDOM.nextInt(24 * 60 * 60 * 1000))).toString();
    }
}
