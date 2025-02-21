package org.example;

import java.util.ArrayList;

public class School {
    private ArrayList<Course> courses;



    public School(){
        this.courses = new ArrayList<>();
        this.courses.add(new Course());
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }

    public String addCourses(Course course){
        this.courses.add(course);
        return "le cours :" + course + "est ajouté";
    }
}
