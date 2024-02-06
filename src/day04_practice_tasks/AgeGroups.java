package day04_practice_tasks;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 5;

        if (age >= 0 && age <= 20) {
            System.out.println("Teenager (0 ~ 20)");
        }
        else if (age >= 21 && age <= 54) {
            System.out.println("Adult   (21 ~ 55)");
        }
        else if (age >= 55 && age <= 150) {
            System.out.println("Senior  (55 or older)");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
