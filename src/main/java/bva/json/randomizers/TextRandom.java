package bva.json.randomizers;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Random text
 */
class TextRandom extends RandomValue {
    private RandomSentence sentence;
    private int sentncesCount;

    @Override
    public String next() {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < sentncesCount; i++)
            text.append(sentence.next()).append(" ");
        return text.toString();
    }

    public TextRandom(int sentencesCount) {
        sentence = new RandomSentence();
        this.sentncesCount = sentencesCount;
    }

    public TextRandom() {
        this(3);
    }


    /**
     * Random sentence from got words
     */
    private class RandomSentence {
        private RandomWord randomWord;

        String next() {
            StringBuilder sentence = new StringBuilder();
            int len = ThreadLocalRandom.current().nextInt(5, 15);
            for (int i = 0; i <= len; i++) {
                if (i == 0) {
                    char[] chars = randomWord.next().toCharArray();
                    chars[0] = ((Character) chars[0]).toString().toUpperCase().charAt(0);
                    sentence.append(new String(chars)).append(" ");
                }
                sentence.append(randomWord.next()).append(i == len ? "." : " ");
            }
            return sentence.toString();
        }

        RandomSentence() {
            randomWord = new RandomWord();
        }
    }
}
