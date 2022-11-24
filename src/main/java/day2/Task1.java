package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberHome = scanner.nextInt();
        if(numberHome > 0 && numberHome <= 4){
            System.out.println("Малоэтажный дом");
        }else if (numberHome >= 5 && numberHome <= 8){
            System.out.println("Среднеэтажный дом");
        }else if(numberHome >= 9){
            System.out.println("Многоэтажный дом");
        }else {
            System.out.println("Ошибка ввода");
        }
    }
}