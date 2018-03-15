package bva.json.types;

public class DateTimeRandom extends DateRandom {
    private TimeRandom timeRandom = new TimeRandom();

    @Override
    public String next() {
        StringBuilder dateTime = new StringBuilder();
        dateTime.append(super.next()).append(" ")
                .append(timeRandom.next());
        return dateTime.toString();
    }

    public DateTimeRandom() {
        super(2017, 2019);
    }

    public DateTimeRandom(int yearFrom, int yearTo) {
        super(yearFrom, yearTo);
    }
}
