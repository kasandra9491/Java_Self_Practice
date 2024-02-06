package day08_practice_tasks; //done

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first word:");
        String word1 = input.next();

        System.out.println("Enter a second word:");
        String word2 = input.next();

        input.close();

        if (word1.charAt(word1.length()-1) == word2.charAt(0)) {
            word1 = word1 + word2.substring(1);
            System.out.println(word1);
        } else {
            word1 = word1.concat(word2);
            System.out.println(word1);
        }
    }
}
