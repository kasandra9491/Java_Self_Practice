package day11_practice_tasks;

public class Employeeclients {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Dmitry iliash", 30, 'M', "QA Engeneer", 150_000);
        employee1.work();
        System.out.println(employee1);

        Employee employee2 = new Employee("Robin Smith", 45, 'F', "Paralegal", 100_000);
        employee2.work();
        System.out.println(employee2);
    }
}
