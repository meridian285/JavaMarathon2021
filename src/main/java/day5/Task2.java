package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2019, "Red", "Yamaha");
        System.out.println(motorbike.getModel() + ", "+motorbike.getColor()+", "+motorbike.getAge());
    }
}
