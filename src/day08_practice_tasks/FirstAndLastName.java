package day08_practice_tasks; //done

import java.util.Scanner;

public class FirstAndLastName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = input.next();

        System.out.println("Enter your second name:");
        String lastName = input.next();

        input.close();

        System.out.println(firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() + " "
                        + lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase());

            }
        }



