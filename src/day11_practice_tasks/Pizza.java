package day11_practice_tasks;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost() {

        if (size.equalsIgnoreCase("small")) {
            int totalCost = 10 + (2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping);
        }
        if (size.equalsIgnoreCase("medium")) {
            int totalCost = 12 + (2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping);
        }
        if (size.equalsIgnoreCase("large")) {
            int totalCost = 14 + (2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping);
        }
        return 0 ;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalCost=" + calcCost() +
                '}';
    }
}
