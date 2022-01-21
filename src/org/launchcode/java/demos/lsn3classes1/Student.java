package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    public void setName(String aName) {
        this.name = aName;
    }

    public int getStudentId() {
        return studentId;
    }
    private void setStudentId(int id) {
        this.studentId = id;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setNumberOfCredits(int credits) {
        this.numberOfCredits = credits;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(int aGpa) {
        this.gpa = aGpa;
    }

}