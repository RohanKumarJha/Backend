package com.infy.object;

public class StudentRegistration {
    private String studentName;
    private double age;
    private int admissionNumber;
    private int rollNumber;
    private static int counter=1001;

    StudentRegistration(String studentName,double age,int admissionNumber) {
        super();
    }

    public String getStudentName() {
        return studentName;
    }
    public double getAge() {
        return age;
    }
    public int getAdmissionNumber() {
        return admissionNumber;
    }
    public int getRollNumber() {
        return rollNumber;
    }

    public void generateRollNumber() {
        rollNumber = counter;
    }
    public int hashCode() {
        return rollNumber;
    }
    public boolean equals() {
        return false;
    }
}