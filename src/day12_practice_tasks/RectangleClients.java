package day12_practice_tasks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(2.5);
        rectangle1.setWidth(3);
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setLength(5);
        rectangle2.setWidth(7.5);
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2);
    }
}
