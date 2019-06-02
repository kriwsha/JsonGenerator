package bva.json.randomizers;

import java.util.List;

/**
 * Random choice from list of values
 */
class ValueChoice<T> extends RandomValue {

    private List<T> values;

    public ValueChoice(List<T> values) {
        this.values = values;
    }

    @Override
    protected String next() {
        int randomValue = RANDOM.nextInt(values.size());
        return values.get(randomValue - 1).toString();
    }
}
