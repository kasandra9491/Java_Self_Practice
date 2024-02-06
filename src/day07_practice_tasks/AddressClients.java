package day07_practice_tasks;

public class AddressClients {
    public static void main(String[] args) {

        Address address1 = new Address();

        address1.buildingNumber = 7925;
        address1.street = "Jones Branch Dr";
        address1.city = "McLean";
        address1.state = "VA";
        address1.zipCode = "22012";

        System.out.println(address1);

        System.out.println("-------------------");

        Address address2 = new Address();

        address2.buildingNumber = 433;
        address2.street = "St Paul Ave";
        address2.city = "Windsor";
        address2.state = "ON";
        address2.zipCode = "N8S 3L3";

        System.out.println(address2);

    }
}
