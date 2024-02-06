package day06_practice_tasks;

public class MathUtility {

    public static void main(String[] args) {

        System.out.println("Result for integer number = " + calculate(1, '-', 3));
        System.out.println("------------------");

        System.out.println("Result for double number = " + calculate(5.3, '*', 7.7));
        System.out.println("------------------");

        System.out.println("Square integer number = " + square(8));
        System.out.println("------------------");

        System.out.println("Square double number = " + square(7.5));
        System.out.println("------------------");

        System.out.println("Cube integer number = " + cube(6));
        System.out.println("------------------");

        System.out.println("Cube double number = " + cube(2.5));

    }

    public static int calculate(int num1, char Operator, int num2) {
        boolean validOperator = Operator == '+' || Operator == '-' || Operator == '*' || Operator == '/';
        if (!validOperator) {
            return 0;
        }
        int result = (Operator == '+')? num1 + num2 : (Operator == '-')? num1 - num2
                : (Operator == '*')? num1 * num2 : num1 / num2;

        return result;
    }

    public static double calculate(double num1, char Operator, double num2) {
        boolean validOperator = Operator == '+' || Operator == '-' || Operator == '*' || Operator == '/';
        if (!validOperator) {
            return 0;
        }
        double result = (Operator == '+') ? num1 + num2 : (Operator == '-') ? num1 - num2
                : (Operator == '*') ? num1 * num2 : num1 / num2;
        return result;
    }

    public static int square(int num) {
        return num * num;
    }

    public static double square(double num) {
        return num * num;
    }

    public static int cube(int num) {
        return square(num) * num;
    }
    public static double cube(double num) {
        return square(num) * num;
    }
}
