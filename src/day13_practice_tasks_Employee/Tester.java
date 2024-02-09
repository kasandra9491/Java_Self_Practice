package day13_practice_tasks_Employee;

public class Tester extends Employee {
    public Tester(String employeeId, String jobTitle, double salary, String company) {
        super(employeeId, jobTitle, salary, company);
    }
    @Override
    public void work (String name) {
        System.out.println(getJobTitle() + " " + name + " is testing");
    }
}
