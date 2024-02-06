package day08_practice_tasks;//done

public class Emailtask2 {
    public static void main(String[] args) {

        String email = "craig_federighi@apple.com";

        String firstName = email.substring(0,5);

        String lastName = email.substring(6, 15);

        String domain = email.substring(16,21);

        System.out.println("First name: " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase());
        System.out.println("Last name: " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase());
        System.out.println("domain = " + domain);

    }
}

