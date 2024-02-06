package day12_practice_tasks;

public class Rectangle {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {

        if (width <= 0 ){

            System.err.println("The radius cannot be less than or equal to zero " + width);
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        if (length <= 0 ){

            System.err.println("The radius cannot be less than or equal to zero " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public double calcArea(){

        return width * length;
    }
    public double calcPerimeter (){
        return 2 * (width + length);
    }
    public String toString() {
        return "Circle{" +
                "width =" + width +
                ", length =" + length +
                ", area =" + calcArea()+
                ", perimeter=" + calcPerimeter()+
                '}';
    }
}

