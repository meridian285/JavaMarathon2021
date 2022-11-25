package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setAge(2020);
        car.setModel("Ford");
        car.setColor("Red");
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getAge());
    }
}
