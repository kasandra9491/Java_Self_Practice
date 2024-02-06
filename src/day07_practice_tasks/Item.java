package day07_practice_tasks;

public class Item {

    public String itemName;
    public double unitPrice;
    public int quantity;

    public double totalCost;


    public double calcCost() {
        totalCost = unitPrice * quantity;
        return totalCost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + totalCost +
                '}';
    }
}
