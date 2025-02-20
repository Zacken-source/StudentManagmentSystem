package org.example;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseCode;
    private int creditHours;
    private ArrayList<Object> students;

    public void enrollStudent(Student student){
        this.students.add(student);
    }

    public ArrayList<Object> getEnrollStudents(){
        return students;
    }

}