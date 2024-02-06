package day07_practice_tasks;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item();

        item1.itemName = "Book";
        item1.unitPrice = 5.3;
        item1.quantity = 5;

        item1.calcCost();

        System.out.println(item1);

        System.out.println("---------------------");

        Item item2 = new Item();

        item2.itemName = "Scissors";
        item2.unitPrice = 3.4;
        item2.quantity = 6;

        item2.calcCost();

        System.out.println(item2);
    }
}
