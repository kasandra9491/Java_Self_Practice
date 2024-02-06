package day11_practice_tasks;

public class CydeoStudentsClients {

    public static void main(String[] args) {

        CydeoStudents cydeoStudents1 = new CydeoStudents("Alice", 22, 01234, 'A', "US022", 6);
        cydeoStudents1.schoolName = "Cydeo";
        cydeoStudents1.programmingLanguage = "Java";
        cydeoStudents1.study();
        cydeoStudents1.attendClass();
        cydeoStudents1.printSchoolName();
        cydeoStudents1.printProgLanguage();
        System.out.println(cydeoStudents1);

        CydeoStudents cydeoStudents2 = new CydeoStudents("Alex", 30, 65433, 'B', "US022", 4);
        cydeoStudents2.schoolName = "Cydeo";
        cydeoStudents2.programmingLanguage = "Java";
        cydeoStudents2.study();
        cydeoStudents2.attendClass();
        cydeoStudents2.printSchoolName();
        cydeoStudents2.printProgLanguage();
        System.out.println(cydeoStudents2);


    }
}
