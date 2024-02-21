package day14_practice_tasks_Car_Task;

public class Nio extends Car implements AutoPark, AutoPilot{

    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }
    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " is self driving");
    }
    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " is autoparking");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " is strating");
    }
    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving");
    }
}
