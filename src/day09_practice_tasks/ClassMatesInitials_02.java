package day09_practice_tasks;

public class ClassMatesInitials_02 {

    public static void main(String[] args) {

        String[] classmates = {"Lilia Iliash", "Sveta Bondarenko", "Dmitry Vodnik"
                , "Oksana Belova", "Yeseniia Melnyk", "Valeria Chanova", "Robin Smith", "Richard Ponic", "Gregory Boyle", "Donna Mugan"};


        for (int i = 0; i < classmates.length; i++) {

            String initials = classmates[i].charAt(0) + "" + classmates[i].charAt(classmates[i].indexOf(" ") + 1);

            System.out.println(initials);
        }
    }
}