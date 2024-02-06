package day12_practice_tasks;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanutes;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity <= 0){
            System.err.println("The quantity can not be less than or equal to zero" + quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0){
            System.err.println("The price cannot be negative " + price);
            System.exit(1);
        }
        this.price = price;
    }
    public boolean isHasPeanutes() {
        return hasPeanutes;
    }
    public void setHasPeanutes(boolean hasPeanutes) {
        this.hasPeanutes = hasPeanutes;
    }
    public String toString() {
        if (price == 0){
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + "free" +
                ", hasPeanutes=" + hasPeanutes +
                '}';
    }
        else {
            return "Candy{" +
                    "brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    ", hasPeanutes=" + hasPeanutes +
                    '}';
        }
    }
}
