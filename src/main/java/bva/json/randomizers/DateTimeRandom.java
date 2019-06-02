package bva.json.randomizers;

public class DateTimeRandom extends DateRandom {
    private TimeRandom timeRandom = new TimeRandom();

    @Override
    public String next() {
        return super.next() + " " + timeRandom.next();
    }


}
