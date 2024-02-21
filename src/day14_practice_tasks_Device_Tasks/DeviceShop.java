package day14_practice_tasks_Device_Tasks;

import java.util.SortedMap;

public class DeviceShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple", "Iphone 14 pro max", 1_500,
                "White", "6", true, true);
        System.out.println(iphone);
        iphone.turnOn();
        iphone.turnOff();
        iphone.call(226786543);
        iphone.text(226786543);
        iphone.downloadApp();

        Samsung samsung = new Samsung("Samsung", "Galaxy A34", 400,
                "Green", "6", true,true);
        System.out.println(samsung);
        samsung.turnOn();
        samsung.turnOff();
        samsung.call(646564653);
        samsung.text(756456534);
        samsung.downloadApp();

        Google google = new Google("Google", "Pixel 7a", 600,
                "Blue", "6", true,true);

        System.out.println(google);
        google.turnOn();
        google.turnOff();
        google.call(768756565);
        google.text(565858855);
        google.downloadApp();

        Computer desktop = new Desktop("Dell", "OptiPlex",500,
                "Black", "24", false, true);

        System.out.println(desktop);
        desktop.turnOn();
        desktop.turnOff();

        Computer laptop = new Desktop("Asus", "TUF F15", 900,
                "Black", "15.6", true, true);

        System.out.println(laptop);
        laptop.turnOn();
        laptop.turnOff();

    }
}
