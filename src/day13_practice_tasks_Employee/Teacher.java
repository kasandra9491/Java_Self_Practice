package day13_practice_tasks_Employee;

public class Teacher extends Employee {

    public Teacher(String employeeId, String jobTitle, double salary, String company) {
        super(employeeId, jobTitle, salary, company);
    }

    @Override
        public void work (String name) {

            System.out.println(name + " is teaching");
        }
}
