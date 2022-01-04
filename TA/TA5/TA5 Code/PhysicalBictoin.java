import java.util.Random;
public class PhysicalBictoin implements ValuableCarriable{

    private final int weight;
    private final int value;
    PhysicalBictoin(Random rng){
        weight = Math.abs(rng.nextInt())%1000;
        value = Math.abs(rng.nextInt())%1000;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
