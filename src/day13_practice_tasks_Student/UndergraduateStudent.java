package day13_practice_tasks_Student;

public class UndergraduateStudent extends Student1 {
    public UndergraduateStudent(String name, int age, String gender, String studentID, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentID, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study () {
        super.study();
    }
}
