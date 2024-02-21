package day14_practice_tasks_Device_Tasks;

public abstract class device {

    private final String brand;
    private final String model;
    private double price;
    private String color;
    private final String size;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank())
            System.exit(1);
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank())
            System.exit(1);
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0)
            System.exit(1);
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank())
            System.exit(1);
        this.color = color;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        if (size == null || size.isEmpty() || size.isBlank())
            System.exit(1);
    }
    public boolean isHasBattery() {
        return hasBattery;
    }
    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }
    public boolean isHasPowerButton() {
        return hasPowerButton;
    }
    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();

    public abstract void turnOff();


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
