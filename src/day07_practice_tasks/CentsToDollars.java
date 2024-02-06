package day07_practice_tasks;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

    Scanner result = new Scanner(System.in);

    System.out.println("Enter the cents:");
    int cents = result.nextInt();
        result.close();

        int remainder = cents % 100;
        int dollars = cents / 100;

        System.out.println(cents  +" cents is equal to " + dollars + " dollars and " + remainder + " cents");
}
    }


