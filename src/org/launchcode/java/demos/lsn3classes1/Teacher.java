package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching = 0;

    Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    private void setFirstName(String fName) {
        this.firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }
    private void setLastName(String lName) {
        this.lastName = lName;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }
    public void setYearsTeaching(int years) {
        this.yearsTeaching = years;
    }

}
