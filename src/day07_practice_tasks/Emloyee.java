package day07_practice_tasks;

public class Emloyee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;

    public void work () {
        System.out.println(jobTitle + " " + name + " is working");
    }

    public String toString() {
        return "Emloyee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
