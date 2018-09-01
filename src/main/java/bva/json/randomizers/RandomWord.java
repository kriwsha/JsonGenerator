package bva.json.randomizers;

import java.util.concurrent.ThreadLocalRandom;

public class RandomWord extends Randomizer {
    private int wordLen;
    private char[] buf;
    private final char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    String next() {
        buf = new char[wordLen];
        for (int i=0; i<buf.length; i++)
            buf[i] = chars[random.nextInt(chars.length)];
        return new String(buf);
    }

    RandomWord() {
        this(3, 8);
    }

    RandomWord(int from, int to) {
        wordLen = ThreadLocalRandom.current().nextInt(from, to);
    }
}