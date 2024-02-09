package day13_practice_tasks_Student;

public class Student1 extends Student {

    private String studentID;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public Student1(String name, int age, String gender, String studentID, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
       if (studentID == null || studentID.isEmpty() || studentID.isBlank()) {
            System.err.println("Student ID can not be null, empty or blank " + studentID);
            System.exit(1);
        }
        this.studentID = studentID;
    }
    public String getFieldOfStudy() {
        return fieldOfStudy;
    }
    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null || fieldOfStudy.isEmpty() || fieldOfStudy.isBlank()) {
            System.err.println("Field Of Study can not be null, empty or blank " + fieldOfStudy);
            System.exit(1);
            this.fieldOfStudy = fieldOfStudy;
        }
    }
        public char getGrade () {
            return grade;
        }
        public void setGrade ( char grade){
            this.grade = grade;
        }
        public String getSchoolName () {
            return schoolName;
        }
        public void setSchoolName (String schoolName){
            if (schoolName == null || schoolName.isEmpty() || schoolName.isBlank()) {
                System.err.println("School name  can not be null, empty or blank " + schoolName);
                System.exit(1);
                this.schoolName = schoolName;
            }
        }
        public void study(){
            System.out.println(super.getName() + " is studing in " + schoolName);
        }

    @Override
    public String toString() {
        return super.toString() +"{" +
                "studentID='" + studentID + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
