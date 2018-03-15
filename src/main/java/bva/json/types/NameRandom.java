package bva.json.types;

import java.util.Random;

public class NameRandom implements RandomStrObj{
    private Random random = new Random();

    @Override
    public String next() {
        return new StringBuilder()
                .append(names[random.nextInt(names.length)])
                .append(" ").append(surnames[random.nextInt(surnames.length)]).toString();
    }

    private String[] names = {"Emma", "Olivia", "Sophia", "Isabella", "Ava", "Mia", "Emily", "William", "Ethan", "Michael", "Alexander", "James", "Daniel", "Benjamin"};
    private String[] surnames = {"Potter", "Granger", "Wisley", "Snape", "Lupin", "Malfoy", "Riddle"};

    public NameRandom() {

    }

    public NameRandom(String[] names, String[] surnames) {
        this.names = names;
        this.surnames = surnames;
    }

    //TODO: разделить имена на мужские и женские
}
