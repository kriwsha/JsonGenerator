package bva.json.randomizers;

/**
 * Random time and date value
 */
class DateTimeRandom extends DateRandom {
    private TimeRandom timeRandom = new TimeRandom();

    @Override
    public String next() {
        return super.next() + " " + timeRandom.next();
    }


}
