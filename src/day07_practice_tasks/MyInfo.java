package day07_practice_tasks;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("Enter your gender:");
        String gender = input.next();

        System.out.println("Enter your full name:");
        String fullName = input.next();

        input.nextLine();

        System.out.println("Enter your phone number:");
        long phoneNumber = input.nextLong();

        System.out.println("Enter your zip code:");
        int zipCode = input.nextInt();

        System.out.println("Enter your School name:");
        String schoolName = input.next();

        System.out.println("Enter your city name:");
        String cityName = input.next();

        System.out.println("Enter your state name:");
        String stateName = input.next();

        System.out.println("Enter your building number:");
        int buildingNumber = input.nextInt();

        System.out.println("Enter your Street name:");
        String streetName = input.next();

        input.close();

        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("School: " + schoolName);
        System.out.println("Address: " );
        System.out.println(buildingNumber + " " + streetName);
        System.out.println(cityName + " " + stateName + "," + zipCode);

    }
}
