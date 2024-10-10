public class RegistrationTester {
    public static void main(String[] args) {
        // Create a student registration object to hold values for student
        StudentRegistration obj1 = new StudentRegistration("Peter",23, 5001);
        System.out.println(obj1.getStudentName()+" : "+obj1.getAge()+" : "+obj1.getAdmissionNumber()+" : "+obj1.hashCode());

        StudentRegistration obj2 = new StudentRegistration("Peter",24, 5003);
        System.out.println(obj2.getStudentName()+" : "+obj2.getAge()+" : "+obj2.getAdmissionNumber());
        obj2.generateRollNumber();
    } 
}