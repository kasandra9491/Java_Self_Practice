package day13_practice_tasks_Student;

public class CydeoStudent extends Student1 {

    private int batchNumber;
    private int groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, String gender, String studentID, String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentID, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }
    public int getBatchNumber() {
        return batchNumber;
    }
    public void setBatchNumber(int batchNumber) {
        if (batchNumber < 0){
            System.err.println("Batch number can not be negative " + batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }
    public int getGroupNumber() {
        return groupNumber;
    }
    public void setGroupNumber(int groupNumber) {
        if (groupNumber < 0){
            System.err.println("Group number can not be negative " + groupNumber);
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isEmpty() || programmingLanguage.isBlank()) {
            System.err.println("Programming language can not be null, empty or blank " + programmingLanguage);
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void study (){
        super.study();
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
