package day07_practice_tasks;

public class Rectagle {

    public double width;
    public double length;
    public double calculateAr;
    public double calcalatePer;

    public double calculateArea (){
        calculateAr = width * length;
        System.out.println("Area = " + calculateAr);
        return calculateAr;
    }

    public double calculatePerimeter (){
        calcalatePer = width + width + length + length;
        System.out.println("Perimeter = " + calcalatePer);
        return calcalatePer;
    }

    public String toString() {
        return "Rectagle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
