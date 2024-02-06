package day10_practice_tasks;

public class LettersDigitsSpecialChars_01 {

    public static void main(String[] args) {

        String str = "Wooden Spoon123!";
        String digits = "";
        String letters = "";
        String specialChars = "";

        for (char c : str.toCharArray()) {

            if (Character.isDigit(c)) {
                digits += c;
            }
            else if (Character.isLetter(c)) {
                letters += c;
            }
            else {
                specialChars += c;
            }
        }
        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("Special Chars = " + specialChars);
    }
}
