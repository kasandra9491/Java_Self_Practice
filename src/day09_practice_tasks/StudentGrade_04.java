package day09_practice_tasks;

import java.util.Arrays;

public class StudentGrade_04 {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah" };
        int[] scores = {90, 75, 80};
        char[] gradees = new char[scores.length];

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= 90 && scores[i] <= 100) {
                gradees[i] = 'A';
            } else if (scores[i] >= 80 && scores[i] <= 89) {
                gradees[i] = 'B';
            } else if (scores[i] >= 70 && scores[i] <= 79) {
                gradees[i] = 'C';
            } else if (scores[i] >= 60 && scores[i] <= 69) {
                gradees[i] = 'D';
            } else if (scores[i] >= 0 && scores[i] <= 59) {
                gradees[i] = 'F';
            } else {
                System.out.println("Invalid Score");
            }
        }
        System.out.println("grades = " + Arrays.toString(gradees));

        for (int i = 0; i < 3; i++) {

            System.out.println(names[i] + "'s score is " + scores[i] + ", and grade is " + gradees[i]);

        }
    }
}
