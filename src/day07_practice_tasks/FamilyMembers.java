package day07_practice_tasks;

import java.util.Scanner;

public class FamilyMembers {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in) ;

        System.out.println("How many people do you live with?");
        int members = input.nextInt();
        input.close();

        if (members <= 3) {
            System.out.println("Live with less three people");
        } else if (members > 3 && members <= 6) {
            System.out.println("Live with 3-6 people");
        } else {
            System.out.println("live with more than six people");
        }
    }
}
