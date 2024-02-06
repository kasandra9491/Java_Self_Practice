package day07_practice_tasks;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter the radius:");
        double radius = input.nextDouble();
        input.close();

        double area = radius * radius * 3.14;
        System.out.println("The area of the Circle is " + area);
        double perimeter = 2 * radius * 3.14;
        System.out.println("The perimeter of the Circle is " + perimeter);

    }
}
