package day09_practice_tasks;

public class ArrayElements_01 {

    public static void main(String[] args) {

        int[] numbers;
        numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = i + 1;
        }

        for (int number : numbers) {

            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("------------------");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("-------------------");

        for (int i = 0; i < numbers.length; i++) {
            
            if (numbers [i] % 5 == 0) {

                System.out.print(numbers [i] + " ");

            }
        }

    }
}
