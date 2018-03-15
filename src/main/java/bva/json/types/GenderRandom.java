package bva.json.types;

import java.util.Random;

public class GenderRandom implements RandomStrObj{

    @Override
    public String next() {
        if (new Random().nextBoolean())
            return "w";
        return "m";
    }
}
