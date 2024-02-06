package day06_practice_tasks;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        int a = max (100, 200);
        System.out.println("Max integer: " + a);

        System.out.println("--------------------");

        double b = max(5.6, 3.4);
        System.out.println("Max double: " + b);

        System.out.println("--------------------");

        int c = min(100, 200);
        System.out.println("Min integer: " + c);

        System.out.println("--------------------");

        double d = min(5.6, 3.4);
        System.out.println("Min double: " + d);
    }
    public static int max (int num1, int num2) {
        if (num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }
     public static double max (double num1, double num2) {
         if (num1 > num2){
             return num1;
         } else {
             return num2;
         }
     }
    public static int min (int num1, int num2) {
        if (num1 < num2){
            return num1;
        } else {
            return num2;
        }
    }
    public static double min (double num1, double num2) {
        if (num1 < num2){
            return num1;
        } else {
            return num2;
        }
    }
}
