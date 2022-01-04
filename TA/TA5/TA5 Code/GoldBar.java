public class GoldBar implements ValuableCarriable{

    private static final int WEIGHT = 100;
    private static final int VALUE_MULTIPLIER = 10;

    @Override
    public int getWeight() {
        return WEIGHT;
    }

    @Override
    public int getValue() {
        return getWeight()*VALUE_MULTIPLIER;
    }
}
