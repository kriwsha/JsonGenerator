package bva.json.types;

import java.util.Random;

public class GenderRandom implements RandomStrObj{
    private String man;
    private String woman;

    public GenderRandom() {
        this("m", "w");
    }

    public GenderRandom(String man, String woman) {
        this.man = man;
        this.woman = woman;
    }

    @Override
    public String next() {
        return new Random().nextBoolean()? man : woman;
    }
}
