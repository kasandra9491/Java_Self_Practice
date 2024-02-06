package day08_practice_tasks;// done

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();
        input.close();

        if (word.startsWith("x")) {
            word = word.replaceFirst("x", "a");
            System.out.println("New word = " + word);
        }
    }
}