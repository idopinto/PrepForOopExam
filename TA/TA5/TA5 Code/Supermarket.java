import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Supermarket {


    private final long seed;
    private final Random rng;
    private List<ValuableCarriable> stock;


    Supermarket(long seed, int numberOfItems){
        this.seed = seed;
        rng = new Random(seed);
        stock = new ArrayList<ValuableCarriable>(numberOfItems);
        stockIsles(numberOfItems);
    }

    public List<ValuableCarriable> getStock() {
        return stock;
    }

    /**
     * Add random items to the stock
     */
    private void stockIsles(int numberOfItems) {
        for(int i=0; i<numberOfItems; i++){
            int j = rng.nextInt()%5;
            switch (j){
                case 0:
                    stock.add(new GoldBar());
                    break;
                case 1:
                    stock.add(new PhysicalBictoin(rng));
                    break;
                case 2:
                    stock.add(HippyIcecream.CHOCOLATE);
                    break;
                case 3:
                    stock.add(HippyIcecream.VANILLA);
                    break;
                case 4:
                    stock.add(HippyIcecream.PASTACHIO);
                    break;
            }
        }
    }


}

