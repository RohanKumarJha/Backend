public class Student {
    private int studentId;
    private String name;
    private float qualifyingExamMarks;
    private char residentialStatus;
    private int yearOfEngg;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQualifyingExamMarks(float qualifyingExamMarks) {
        this.qualifyingExamMarks = qualifyingExamMarks;
    }
    public void setResidentialStatus(char residentialStatus) {
        this.residentialStatus = residentialStatus;
    }
    public void setYearOfEngg(int yearOfEngg) {
        this.yearOfEngg = yearOfEngg;
    }

    public int getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public float getQualifyingExamMarks() {
        return qualifyingExamMarks;
    }
    public int getResidentialStatus() {
        return residentialStatus;
    }
    public int getYearOfEngg() {
        return yearOfEngg;
    }
}
