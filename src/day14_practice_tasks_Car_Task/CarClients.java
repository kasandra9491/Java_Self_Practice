package day14_practice_tasks_Car_Task;

import day13_practice_tasks_Student.CydeoStudent;

public class CarClients {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota", "Corolla", 2022, 23_000, "White");
        System.out.println(toyota);
        toyota.stop();
        toyota.start();
        toyota.drive();

        Honda honda = new Honda("Honda", "Civic", 2024, 28_754, "Red");
        System.out.println(honda);
        honda.stop();
        honda.drive();
        honda.start();

        BMW bmw = new BMW("BMW", "iX", 2023, 82_000, "Blue");
        System.out.println(bmw);
        bmw.stop();
        bmw.drive();
        bmw.start();

        Audi audi = new Audi("Audi", "Q4 e-tron", 2024,63_700,"Grey");
        System.out.println(audi);
        audi.start();
        audi.drive();
        audi.autoPark();

        Mercedes mercedes = new Mercedes("Mercedes", "A-Class", 2022, 54_766, "Black");
        System.out.println(mercedes);
        mercedes.autoPark();
        mercedes.start();
        mercedes.drive();

        Tesla tesla = new Tesla("Tesla","Model 3", 2024, 53_990, "White");
        System.out.println(tesla);
        tesla.start();
        tesla.drive();
        tesla.autoPark();
        tesla.selfDrive();

        Nio nio = new Nio("Nio", "ET5",2023, 46_100, "Red");
        System.out.println(nio);
        nio.start();
        nio.drive();
        nio.autoPark();
        nio.selfDrive();

        CydeoCar cydeoCar = new CydeoCar("Cydeo", "Car", 2024, 100_000, "Blue - White");
        System.out.println(cydeoCar);
        cydeoCar.start();
        cydeoCar.drive();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();
    }
}
