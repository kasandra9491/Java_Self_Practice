package day08_practice_tasks;

public class Emailtask1 {

    public static void main(String[] args) {


        String email = "mike_tyson@gmail.com";

        int underSc = email.indexOf('_');
        int atSymb = email.indexOf('@');
        String newEmail;
     

        if (email.contains("_")) {
            String firstName = email.substring(0, underSc);
            String lastName = email.substring(underSc + 1, atSymb);
            String domain = email.substring(atSymb);
            newEmail = firstName.replace(firstName, lastName) + "_" + firstName + domain;

            System.out.println(newEmail);

        } else {
            newEmail = email;
            System.out.println(newEmail);
        }
    }
}
