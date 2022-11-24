package day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        int oddNumbers = 0;
        int evenNumbers = 0;
        int moreEight = 0;
        int summ = 0;
        for(int i=0;i<array.length;i++){
            array[i] = random.nextInt(10);
            summ +=array[i];
            if(array[i]>8)
                moreEight += 1;
            if(array[i] % 2 == 0) {
                evenNumbers += 1;
            }else oddNumbers+=1;

        }
        System.out.print(Arrays.toString(array));
        System.out.println();
        System.out.println("Длинна массива: "+array.length);
        System.out.println("Количестве чисел больше 8: "+moreEight);
        System.out.println("Количестве четных чисел: "+evenNumbers);
        System.out.println("Количестве нечетных чисел: "+oddNumbers);
        System.out.println("Сумме всех элементов массива: "+summ);
    }
}
