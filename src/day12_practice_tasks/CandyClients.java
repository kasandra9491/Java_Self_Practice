package day12_practice_tasks;

public class CandyClients {

    public static void main(String[] args) {

        Candy candy1 = new Candy();
        candy1.setBrand("Milka");
        candy1.setQuantity(2);
        candy1.setPrice(2);
        candy1.setHasPeanutes(true);
        System.out.println(candy1.getBrand());
        System.out.println(candy1.getQuantity());
        System.out.println(candy1.getPrice());
        System.out.println(candy1.isHasPeanutes());
        System.out.println(candy1);

        Candy candy2 = new Candy();
        candy2.setBrand("Rochen");
        candy2.setQuantity(4);
        candy2.setPrice(0);
        candy2.setHasPeanutes(false);
        System.out.println(candy2.getBrand());
        System.out.println(candy2.getQuantity());
        System.out.println(candy2.getPrice());
        System.out.println(candy2.isHasPeanutes());
        System.out.println(candy2);
    }
}
