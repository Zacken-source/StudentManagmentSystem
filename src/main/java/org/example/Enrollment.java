package org.example;

public class Enrollment {
    private Student student;
    private Course course;

    public void register(Student student,Course course){
        this.student = student;
        this.course = course;
    }

}
