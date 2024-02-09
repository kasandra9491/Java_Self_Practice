package day13_practice_tasks_phone;

public class PhoneClients {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("Apple","Iphone 15 pro max", "147:71.5:7.8", 1_747,"White");
        iPhone.call("+12264567878");
        iPhone.text("+12264567878");
        iPhone.faceTime("+12264567878");
        System.out.println(iPhone);

        System.out.println("--------------------------------------");

        Samsung samsung = new Samsung("Samsung","Galaxy S23 Plus", "6.21:3.0:0.3", 1_456.99,"Black");
        samsung.call("+12268763454");
        samsung.text("+12268763454");
        samsung.faceTime("+12268763454");
        System.out.println(samsung);

        System.out.println("--------------------------------------");

        Nokia nokia = new Nokia("Nokia","Nokia G22", "6.5:3.0:0.33", 249.99,"Green");
        nokia.call("+12268763454");
        nokia.text("+12268763454");
        nokia.faceTime("+12268763454");
        System.out.println(nokia);
    }
}
