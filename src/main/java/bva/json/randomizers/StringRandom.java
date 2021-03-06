package bva.json.randomizers;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

/**
 * Random string
 */
class StringRandom extends RandomValue {

    private static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String digits = "0123456789";
    private static final String lower = upper.toLowerCase(Locale.ROOT);
    private static final String alphanum = upper + lower + digits;
    private final char[] symbols;
    private final char[] buf;



    StringRandom(int length, Random random, String symbols) {
        if (length < 1) throw new IllegalArgumentException();
        if (symbols.length() < 2) throw new IllegalArgumentException();
        this.RANDOM = Objects.requireNonNull(random);
        this.symbols = symbols.toCharArray();
        this.buf = new char[length];
    }

    @Override
    public String next() {
        for (int idx = 0; idx < buf.length; ++idx)
            buf[idx] = symbols[RANDOM.nextInt(symbols.length)];
        return new String(buf);
    }


    StringRandom(int length, Random random) {
        this(length, random, alphanum);
    }


    StringRandom(int length) {
        this(length, new SecureRandom());
    }

    StringRandom() {
        this(10);
    }
}
