package day04_practice_tasks;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 10;

        if ((a >= b && a <= c) || (a <= b && a >= c) ) {
            System.out.println("Median Number is " + a);
        }
        else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            System.out.println("Median number is " + b);
        }
        else {
            System.out.println(c);

        }
    }
}
