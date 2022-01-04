public enum HippyIcecream implements ValuableCarriable{


    CHOCOLATE(10, 5),
    VANILLA(1, 100),
    PASTACHIO(100, 20);
    private final int flavor_value;
    private final int weight;


    HippyIcecream(int value, int weight){
        this.flavor_value = value;
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getValue() {
        return flavor_value/weight;
    }
}