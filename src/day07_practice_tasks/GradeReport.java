package day07_practice_tasks;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter score");
        int score = input.nextInt();
        input.close();

        if (score >= 90 && score <= 100){
            System.out.println("Your grade is A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Your grade is B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Your grade ic C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Your grade is D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Invalid Score");
        }

    }
}
