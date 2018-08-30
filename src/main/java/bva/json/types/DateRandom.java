package bva.json.types;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DateRandom extends Randomizer implements RandomStrObj{

    @Override
    public String next() {
        StringBuilder date = new StringBuilder();
        int monthNum = random.nextInt(months.length);
        date.append(months[monthNum]).append(" ");
        int dayCount;
        switch (monthNum) {
            case 1:
                dayCount = 28;
                break;
            case 3|5|8|10:
                dayCount = 30;
                break;
            default:
                dayCount = 31;
                break;
        }
        date.append(ThreadLocalRandom.current().nextInt(1, dayCount)).append(", ").append(ThreadLocalRandom.current().nextInt(yearFrom, yearTo));
        return date.toString();
    }

    protected final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    protected int yearFrom;
    protected int yearTo;


    public DateRandom() {
        this(1950, 2000);
    }

    public DateRandom(int yearFrom, int yearTo) {
        this.yearFrom = yearFrom;
        this.yearTo = yearTo;
    }

    public DateRandom(String params) {
        //
    }

    //TODO: create constuctor DateRandom(year, monthTo)

}
