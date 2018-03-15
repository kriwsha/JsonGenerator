package bva.json.types;

import java.sql.Time;
import java.util.Random;

public class TimeRandom implements RandomStrObj{
    private Random random = new Random();

    @Override
    public String next() {
        return new Time((long) random.nextInt(24*60*60*1000)).toString();
    }
}
