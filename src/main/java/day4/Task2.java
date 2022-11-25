package day4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];

        for (int i: array) {
            array[i] = random.nextInt(10000);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int max = 0;
        for (int i: array) {
            if (i > max)
                max = i;
        }
        System.out.println(max);

        int min = 0;
        for (int i: array) {
            if (i < min)
                min = i;
        }
        System.out.println(min);

        int count10 = 0;
        for (int i: array) {
            if (i % 10 == 0)
                count10 ++;
        }
        System.out.println("количество элементов массива, оканчивающихся на 0: "+ count10);

        int sum = 0;
        for (int i: array) {
            if (i % 10 == 0)
                sum += i;
        }
        System.out.println("сумма элементов массива, оканчивающихся на 0: "+ sum);
    }
}
