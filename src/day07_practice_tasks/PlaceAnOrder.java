package day07_practice_tasks;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name:");
        String productName = input.next();

        System.out.println("Enter the price:");
        double price = input.nextDouble();

        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();

        System.out.println("Enter first name:");
        String firstName = input.next();

        input.close();

        double totalcost = price * quantity;

        System.out.println(firstName + " , your order for " + quantity + " " + productName + " has been placed. Your total is " + totalcost );

    }
}
