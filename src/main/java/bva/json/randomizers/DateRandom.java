package bva.json.randomizers;

import java.util.concurrent.ThreadLocalRandom;

public class DateRandom extends RandomValue implements Randomizer {

    private DateRandom() {}

    public static DateRandom init(String params) {
        return new DateRandom();
    }

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
            case 3 | 5 | 8 | 10:
                dayCount = 30;
                break;
            default:
                dayCount = 31;
                break;
        }
        date.append(ThreadLocalRandom.current().nextInt(1, dayCount)).append(", ").append(ThreadLocalRandom.current().nextInt(yearFrom, yearTo));
        return date.toString();
    }

    private final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private int yearFrom;
    private int yearTo;

}
