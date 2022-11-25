package day6;

public class Car {
    private int age;
    private String color;
    private String model;

    public void info(){
        System.out.println("Это автомобиль!");
    }

    public Car(){

    }
    public Car(int age, String color, String model) {
        this.age = age;
        this.color = color;
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
