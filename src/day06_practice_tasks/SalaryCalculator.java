package day06_practice_tasks;

public class SalaryCalculator {

    public static void main(String[] args) {

        double income = Salary(45, 40);
        System.out.println(income);
    }

    public static double Salary (double hourlyRate, int weeklyHourly) {
         return hourlyRate * weeklyHourly * 52;
    }
}
