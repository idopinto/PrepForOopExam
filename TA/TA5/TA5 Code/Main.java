public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }

    private static void task1(){
        int[][] grid = {{1,3,1},
                {1,5,1},
                {4,2,1}};
        int min_path = MinSumPath.CalculateMinSumPath(grid);
        System.out.println(min_path);
    }

    private static void task2(){
        Burglar swiper = new Burglar(1000);
        int val = swiper.steal(new Supermarket(1000, 1000));
        System.out.println("The value stolen from the supermarket is " + val);
    }


}
