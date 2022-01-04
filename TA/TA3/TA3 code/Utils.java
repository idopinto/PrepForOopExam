import java.io.*;
import java.util.*;

public class Utils {

    private static float[] creteSumArray(float[] arr) {
        float[] sumArr = new float[arr.length];
        sumArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sumArr[i] = sumArr[i - 1] + arr[i];
        }
        return sumArr;
    }

    public static int minElements(float[] arr) {

        Arrays.sort(arr); // in place sorting
        float[] sumArr = creteSumArray(arr);
        int numOfElm = 0;
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
            numOfElm += 1;
            if (sum >= sumArr[i - 1]) {
                return numOfElm;
            }
        }
        return arr.length;
    }

    static void printVector(Vector<Integer> v)
    {

        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");

        System.out.println();
    }

    static void print_arr(float[] arr){
        System.out.print("{ ");
        for(float number : arr){
            if(number != 0){
                System.out.print(number);
                System.out.print(", ");
            }
        }
        System.out.println(" }");
        System.out.println();
    }

    public static void findTwoGroup(int n) {
        int sum = n * (n + 1) / 2;

        // Sum of elements of group1
        int group1Sum = sum / 2;

        float[] group1 = new float[n];
	    float[] group2 = new float[n];
        //Vector<Integer> group1 = new Vector<Integer>();
        //Vector<Integer> group2 = new Vector<Integer>();

        for (int i = n; i > 0; i--) {

            // If sum is greater then or equal
            // to 0 include i in group1
            // otherwise include in group2
            if (group1Sum - i >= 0) {
		
		        group1[n-i] = i;
		        group2[n-i] = 0;
                //group1.add(i);

                // Decrease sum of group1
                group1Sum -= i;
            } else {
		        group2[n-i] = i;
                group1[n-i] = 0;
		        //group2.add(i);
            }
        }
        print_arr(group1);
        print_arr(group2);
        // printVector(group1);
        // printVector(group2);


    }



}
