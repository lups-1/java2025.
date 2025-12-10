package Laba4;

import java.util.Arrays;

public class Tlab4 {
    public static void main(String[] args) {
        int [] array = {4, 3, 1, 2};
        System.out.println(Arrays.toString(array));
        System.out.println(sum(array));
    }
    public static double sum(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
