package day07_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Emloyee employee1 = new Emloyee();

        employee1.name = "Liliia Iliash";
        employee1.age = 29;
        employee1.gender = 'F';
        employee1.jobTitle = "QA Engineer";
        employee1.salary = 10_0000;

        employee1.work();

        System.out.println(employee1);

        System.out.println("----------------------------");

        Emloyee employee2 = new Emloyee();

        employee2.name = "Dmitry Samohin";
        employee2.age = 30;
        employee2.gender = 'M';
        employee2.jobTitle = "Cleaner";
        employee2.salary = 2_000;

        employee2.work();

        System.out.println(employee2);

    }

}
