package day13_practice_tasks_State;

public class StateClients {

    public static void main(String[] args) {

        California california = new California("California", "CA","California Democratic Party", "Gavin Newsom", "Alex Padilla", 38_900_000);
        System.out.println(california);

        Florida florida = new Florida("Florida", "FL", "Republian party", "Ron DeSantis", "Rick Scott", 21_780_000);
        System.out.println(florida);

        Texas texas = new Texas("Texas", "TX","Republican Party","Greg Abbott","Ted Cruz", 29_530_000);
        System.out.println(texas);

        Virginia virginia = new Virginia("Virginia", "VA", "Republican party", "Glenn Youngkin","Mark Warner", 8_642_000);
        System.out.println(virginia);

    }
}
