package day04_practice_tasks;

public class Grade2 {

    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {

        case 'A' -> System.out.println("Excellent");
        case 'B' -> System.out.println("Great job");
        case 'C' -> System.out.println("Good");
        case 'D' -> System.out.println("Passed");
        case 'F' -> System.out.println("Failed");
        default -> System.out.println("Invalid Grade");
    }

    }
}
