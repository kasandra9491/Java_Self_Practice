package day09_practice_tasks;

public class EvenOddNumbers_03 {

    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5, 6, 7};
        int countEven = 0;
        int countOdd = 0;

        for (int i : array) {
            if (i % 2 != 0)
                countOdd ++;
            else  {
                countEven ++;
            }
        }

        System.out.println("The array has " + countOdd + " odd numbers and " + countEven + " even numbers.");

    }
}

