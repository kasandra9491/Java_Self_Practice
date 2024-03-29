package day14_practice_tasks_Device_Tasks;

public class PersonalComputer extends Computer{
    public PersonalComputer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
    @Override
    public void turnOn(){
        System.out.println(getBrand() + " " + getModel() + " is turning on");
    }

    @Override
    public void turnOff(){
        System.out.println(getBrand() + " " + getModel() + " is turning off");
    }

}
