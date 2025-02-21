package org.example;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseCode;
    private int creditHours;
    private ArrayList<Object> students;


    public void Course (){
        this.courseName = "POO";
        this.courseCode = 1;
        this.creditHours = 14;
        this.students.add(new Student());
    }
    public void Course (String courseName, int courseCode, int creditHours){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
        this.students.add(new Student());
    }


    public void enrollStudent(Student student){
        this.students.add(student);
    }

    public ArrayList<Object> getEnrollStudents(){
        return students;
    }

}