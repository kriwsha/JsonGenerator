package bva.json.types;

import java.util.Random;

public class GenderRandom implements RandomStrObj{


    @Override
    public String next() {
        return new Random().nextBoolean()? "m" : "w";
    }
}
