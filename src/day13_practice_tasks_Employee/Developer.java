package day13_practice_tasks_Employee;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String employeeId, String jobTitle, double salary, String company, String programmingLanguage) {
        super(employeeId, jobTitle, salary, company);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isEmpty() || programmingLanguage.isBlank()) {
            System.err.println("Programming Language can not be null, empty or blank " + programmingLanguage);
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work (String name){
        System.out.println(getJobTitle() + " " + name + " is coding in " + programmingLanguage);
    }
    @Override
    public String toString() {
        return super.toString() + "{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
