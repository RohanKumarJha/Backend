
public class Tester {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentId(1002);
        student1.setName("Rohan");
        student1.setQualifyingExamMarks(65);
        student1.setResidentialStatus('H');
        student1.setYearOfEngg(2021);
        System.out.println(student1.getStudentId()+" : "+student1.getName()+" : "+student1.getQualifyingExamMarks()+" : "+student1.getResidentialStatus()+" : "+student1.getYearOfEngg());

        Student student2 = new Student();
        student2.setStudentId(1001);
        student2.setName("Rishabh");
        student2.setQualifyingExamMarks(65);
        student2.setResidentialStatus('D');
        student2.setYearOfEngg(2019);
        System.out.println(student2.getStudentId()+" : "+student2.getName()+" : "+student2.getQualifyingExamMarks()+" : "+student2.getResidentialStatus()+" : "+student2.getYearOfEngg());
    }
}