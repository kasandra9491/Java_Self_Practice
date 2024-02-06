package day06_practice_tasks;

public class DayAndMonth {

    public static void main(String[] args) {

        System.out.println(day(5));
        System.out.println("-----------------");

        System.out.println(monthName(5));
        System.out.println("-----------------");

        System.out.println(daysInMonth(5));
        System.out.println("-----------------");

    }

    public static String day(int Day) {
        String numberDay;
        switch (Day) {
            case 1 -> numberDay = "Monday";
            case 2 -> numberDay = "Tuesday";
            case 3 -> numberDay = "Wednesday";
            case 4 -> numberDay = "Thursday";
            case 5 -> numberDay = "Friday";
            case 6 -> numberDay = "Saturday";
            case 7 -> numberDay = "Sunday";
            default -> numberDay = "Invalid number";
        }
        return numberDay;
    }
    public static String monthName (int month) {
        String numberMonth;
        switch (month) {
            case 1 -> numberMonth = "January";
            case 2 -> numberMonth = "February";
            case 3 -> numberMonth = "March";
            case 4 -> numberMonth = "April";
            case 5 -> numberMonth = "May";
            case 6 -> numberMonth = "June";
            case 7 -> numberMonth = "July";
            case 8 -> numberMonth = "August";
            case 9 -> numberMonth = "September";
            case 10 -> numberMonth = "October";
            case 11 -> numberMonth = "November";
            case 12 -> numberMonth = "December";
            default -> numberMonth = "Invalid number";
        }
        return numberMonth;
    }
    public static String daysInMonth (int month) {
        String numberMonth;
        switch (month) {
            case 1 -> numberMonth = "January has 31 days";
            case 2 -> numberMonth = "February has 28 days";
            case 3 -> numberMonth = "March has 31 days";
            case 4 -> numberMonth = "April has 30 days";
            case 5 -> numberMonth = "May has 31 days";
            case 6 -> numberMonth = "June has 30 days";
            case 7 -> numberMonth = "July has 31 days";
            case 8 -> numberMonth = "August has 31 days";
            case 9 -> numberMonth = "September has 30 days";
            case 10 -> numberMonth = "October has 31 days";
            case 11 -> numberMonth = "November has 30 days";
            case 12 -> numberMonth = "December has 31 days";
            default -> numberMonth = "Invalid number";
        }
        return numberMonth;
    }

}
