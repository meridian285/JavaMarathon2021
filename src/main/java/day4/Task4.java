package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }
        int sum1 = 0;
        int sumFirstNumber = 0;
        for (int i = 1; i < array.length-1; i++){
            int sum = array[i - 1] + array[i] + array[i + 1];
            if (sum1 < sum){
                sum1 = sum;
                sumFirstNumber = i - 1;
            }
        }
        System.out.println();
        System.out.println(sum1);
        System.out.println(sumFirstNumber);
    }
}
