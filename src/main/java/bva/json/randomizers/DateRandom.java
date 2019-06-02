package bva.json.randomizers;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Random date value
 */
class DateRandom extends RandomValue {

    private static final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private int yearFrom;
    private int yearTo;

    public static DateRandom init(String params) {
        return new DateRandom();
    }

    @Override
    public String next() {
        int monthNum = RANDOM.nextInt(months.length - 1);

        StringBuilder date = new StringBuilder();
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



        date.append(
                ThreadLocalRandom.current()
                        .nextInt(1, dayCount))
                .append(", ")
                .append(ThreadLocalRandom.current()
                        .nextInt(yearFrom, yearTo));
        return date.toString();
    }

}
