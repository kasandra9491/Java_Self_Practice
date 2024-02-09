package day13_practice_tasks_Employee;

public class EmployeeClients {

    public static void main(String[] args) {

        Tester tester = new Tester("B345", "SDET", 100_000,
                "Amazon");

        tester.work("Dmitry Iliash");
        System.out.println(tester);

        System.out.println("----------------------------");

        Developer developer = new Developer("V5764","Java developer", 120_000,
                "Microsoft", "Java");

        developer.work("Robin Ponic");
        System.out.println(developer);

        System.out.println("----------------------------");

        Teacher teacher = new Teacher("T8764", "Teacher english", 110_000,
                "David Suzuki Public School");

        teacher.work("Alice Smith");
        System.out.println(teacher);

        System.out.println("---------------------------");

        Driver driver = new Driver("D6585", "Truck driver", 90_000,
                "GMC");
        driver.work("Richard Boyle");
        System.out.println(driver);

    }
}
