package day04_practice_tasks;

public class FINRA {

    public static void main(String[] args) {

        int num = 22;

        if (num%3==0 && num%5==0) {
            System.out.println("FINRA");
        }
        else if (num%5==0) {
            System.out.println("RA");
        }
        else if (num%3==0) {
            System.out.println("FIN");
        }
        else {
            System.out.println("The number is not divisible by 3 and 5");
        }
    }
}
