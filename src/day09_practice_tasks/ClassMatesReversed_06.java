package day09_practice_tasks;

public class ClassMatesReversed_06 {

    public static void main(String[] args) {


    String[] classmates = {"Lilia Iliash", "Sveta Bondarenko", "Dmitry Vodnik"
            , "Oksana Belova", "Yeseniia Melnyk", "Valeria Chanova", "Robin Smith", "Richard Ponic", "Gregory Boyle", "Donna Mugan"};

        for (int i = classmates.length - 1; i >= 0; i--) {
            System.out.println(classmates[i] + " ");
        }
    }
}

