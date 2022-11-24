package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        for(int i:array){
            array[i] = random.nextInt(10);
            System.out.println(array[i]);
        }
        System.out.println("Длинна массива = "+array.length);
        for (int i:array){
            if(array[i]>8)
                System.out.println(array[i]);
        }
    }
}
