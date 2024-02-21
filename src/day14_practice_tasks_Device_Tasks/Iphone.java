package day14_practice_tasks_Device_Tasks;

public class Iphone extends Phone implements Downloable,AppleApps {

    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading app");
    }
    @Override
    public String OS() {
        return "IOS";
    }
    @Override
    public String AppStoreName() {
        return "App Store";
    }

}
