package bva.json.randomizers;

public class CurrencyRandom extends Randomizer implements RandomStrObj{
    private String[] currency = {"$", "\u20BD", "€", "£"};

    @Override
    public String next() {
        StringBuilder curr = new StringBuilder()
                .append(currency[random.nextInt(currency.length)])
                .append(" ");
        char[] qua = Integer.toString(random.nextInt(1_000_000)).toCharArray();
        int c = qua.length % 3;
        for (int i=0; i<qua.length; i++) {
            if ((i == c || (i - c) % 3 == 0) && (i != 0))
                curr.append(",");
            curr.append((Character) qua[i]);
        }
        return curr.toString();
    }
}