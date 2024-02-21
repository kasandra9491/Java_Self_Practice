package day14_practice_tasks_Device_Tasks;

public class Google extends Phone implements Downloable, AndroidApps {

    public Google(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);

    }
    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading app");
    }
    @Override
    public String OS (){
        return "Android";
    }
    @Override
    public  String AppStoreName(){
        return "Google Play";
    }
}
