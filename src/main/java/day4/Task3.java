package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[12][8];
        for (int m = 0; m < array.length; m++){
            for (int n = 0; n < array[m].length; n++) {
                array[m][n] = random.nextInt(50);
            }
        }

        for (int m = 0; m < array.length; m++){
            for (int n = 0; n < array[m].length; n++) {
            }
        }
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int m = 0; m < array.length; m++){
            int sum = 0;
            for (int n = 0; n < array[m].length; n++) {
                sum = sum + array[m][n];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = m;
            }
        }
        System.out.println(maxSumIndex);
    }
}
