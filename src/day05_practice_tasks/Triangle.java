package day05_practice_tasks;

public class Triangle {

    public static void main(String[] args) {

        int star = 10;

        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
