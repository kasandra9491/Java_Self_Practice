package day04_practice_tasks;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 5 ;

        switch (month) {

            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("This month has 31 days");
            case 4, 6, 9, 11 -> System.out.println("This month has 30 days");
            case 2 -> System.out.println("This month has 28 days");
            default -> System.out.println("Invalid");

        }
    }
}
