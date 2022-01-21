package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class SchoolPractice {



    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        HashMap<String, Double> students = new HashMap<String, Double>();
        HashMap<String, String> teachers = new HashMap<String, String>();
        ArrayList<HashMap> school = new ArrayList<HashMap>();

        Teacher teacher1 = new Teacher("Sam", "Harrison", "History", 3);
        Teacher teacher2 = new Teacher("Parson", "Gregor", "Latin", 6);

        teachers.put(teacher1.getName(), teacher1.getSubject());
        teachers.put(teacher2.getName(), teacher2.getSubject());

        Student newStudent = new Student("Isaac", 1, 1, 4.0);
        Student newStudent1 = new Student("Greg", 1, 1, 4.0);

        students.put(newStudent.getName(), newStudent.getGpa());
        students.put(newStudent1.getName(), newStudent1.getGpa());

        school.add(teachers);
        school.add(students);

        System.out.println(school);
    }
}
