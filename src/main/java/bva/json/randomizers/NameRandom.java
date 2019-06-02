package bva.json.randomizers;

public class NameRandom extends RandomValue {

    @Override
    public String next() {
        return String.format("%s %s",
                names[RANDOM.nextInt(names.length - 1)],
                surnames[RANDOM.nextInt(surnames.length - 1)]);
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
