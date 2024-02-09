package day13_practice_tasks_Student;

public class StudentClients {

    public static void main(String[] args) {

        GraduateStudent graduateStudent = new GraduateStudent("Dmitry", 29,
                "male", "01020", "SDET", 'A',"Cydeo");

        graduateStudent.study();
        System.out.println(graduateStudent);

        System.out.println("--------------------------");

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Alex", 24,"male"
                ,"0345", "Java", 'C', "Cydeo");
        undergraduateStudent.study();
        System.out.println(undergraduateStudent);

        System.out.println("---------------------------");

        CydeoStudent cydeoStudent = new CydeoStudent("Yulia", 20, "female",
                "04567","SDET", 'A', "Cydeo", 45,
                9, "C++");
        cydeoStudent.study();
        System.out.println(cydeoStudent);
    }
}
