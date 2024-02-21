package day14_practice_tasks_Car_Task;

public class Audi extends Car implements AutoPark {
    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
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
