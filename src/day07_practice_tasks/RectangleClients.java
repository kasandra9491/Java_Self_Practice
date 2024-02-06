package day07_practice_tasks;

public class RectangleClients {
    public static void main(String[] args) {

        Rectagle rectagle1 = new Rectagle();

        rectagle1.width = 5.3;
        rectagle1.length = 3.5;

        rectagle1.calculateArea();
        rectagle1.calculatePerimeter();
        System.out.println(rectagle1);

        System.out.println("----------------------");

        Rectagle rectagle2 = new Rectagle();

        rectagle2.width = 7.8;
        rectagle2.length = 8.7;

        rectagle2.calculateArea();
        rectagle2.calculatePerimeter();
        System.out.println(rectagle2);



    }
}
