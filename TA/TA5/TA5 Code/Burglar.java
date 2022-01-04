ppublic class Burglar {

    private final int knapsackCapacity;

    Burglar(int knapsackCapacity) {
        this.knapsackCapacity = knapsackCapacity;
    }

    public int steal(Supermarket market) {
        var stock = market.getStock();
        int[][] valArr = new int[market.getStock().size()][knapsackCapacity + 1];
        for (int i = 0; i < stock.size(); i++) {
            var item = stock.get(i);
            for (int j = 0; j <= knapsackCapacity; j++) {
                if (i == 0) {
                    if (item.getWeight() > j) {
                        valArr[i][j] = 0;
                    } else {
                        valArr[i][j] = item.getValue();
                    }
                } else {
                    if (item.getWeight() > j) {
                        valArr[i][j] = valArr[i - 1][j];
                    } else {
                        valArr[i][j] = Math.max(valArr[i - 1][j], valArr[i - 1][j - item.getWeight()] + item.getValue());
                    }
                }
            }
        }

        return valArr[stock.size() - 1][knapsackCapacity];
    }
}
