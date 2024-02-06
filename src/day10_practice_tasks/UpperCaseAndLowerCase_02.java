package day10_practice_tasks;

public class UpperCaseAndLowerCase_02 {

    public static void main(String[] args) {

        String str = "JAVA java";
        int upperCase = 0;
        int lowercase = 0;


        for (char c : str.toCharArray()) {

            if (Character.isUpperCase(c)) {
                upperCase++;
            }
            if (Character.isLowerCase(c)){
                lowercase++;
            }
        }
        boolean result = upperCase == lowercase;
        System.out.println(result);
    }
}
