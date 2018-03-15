package bva.json;

import bva.json.types.TextRandom;

public class App {

    public static void main(String[] args) {
        generate();
    }

    private static void generate() {
        TextRandom text = new TextRandom();
        for (int i =0 ; i<10; i++)
            System.out.println(text.next());
    }
}
