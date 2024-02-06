package day12_practice_tasks;

public class Circle {
    private double radius;
    private static final double PI = 3.14;

    public double getRadius() {

        return radius;
    }
    public void setRadius(double radius) {

        if (radius <= 0 ){

            System.err.println("The radius cannot be less than or equal to zero " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public double calcArea(){
        return radius * radius * PI;
    }
    public double calcPerimeter (){
        return 2 * radius * PI;
    }

    public String toString() {
        return "Circle{" +
                "radius =" + radius +
                ", area =" + calcArea()+
                ", perimeter=" + calcPerimeter()+
        '}';
    }
}
