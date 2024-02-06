package day12_practice_tasks;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() ) {
            System.err.println("Invalid name " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0 ){

            System.err.println("The unit price cannot be negative " + unitPrice);
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity < 0 ){

            System.err.println("The quantity can not be negative " + quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double totalCost(){
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Total cost=" + totalCost() +
                '}';
    }
}
