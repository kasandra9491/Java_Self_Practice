package day05_practice_tasks;

public class SumOfNumbers {

    public static void main(String[] args) {

        int number = 50;
        int sum = 0;

        for (int i = 1; i <= number; i++){
        sum += i;
        }
        System.out.println("Sum Of Numbers = " + sum);
    }
}
