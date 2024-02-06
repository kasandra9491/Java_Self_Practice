package day12_practice_tasks;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item();
        item1.setName("@Cheese");
        item1.setUnitPrice(2.5);
        item1.setQuantity(5);
        System.out.println(item1.getName());
        System.out.println(item1.getUnitPrice());
        System.out.println(item1.getQuantity());
        System.out.println(item1);

        Item item2 = new Item();
        item2.setName("Milk");
        item2.setUnitPrice(7.5);
        item2.setQuantity(3);
        System.out.println(item2.getName());
        System.out.println(item2.getUnitPrice());
        System.out.println(item2.getQuantity());
        System.out.println(item2);
    }
}
