package day14_practice_tasks_Car_Task;

public class CydeoCar extends Car implements AutoPilot,AutoPark,Flyable{

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }
    @Override
    public void fly(){
        System.out.println(getMake() + " " + getModel() + " is flying");
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
