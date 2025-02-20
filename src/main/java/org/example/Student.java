package org.example;

import java.util.ArrayList;

public class Student {
    private String name;
    private int studentId;
    private int age;
    private ArrayList<Integer> grades;


    public Student(String name, int studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.grades = new ArrayList<>();
    }


    public void addGrade(Integer grade) {
        grades.add(grade);
    }


    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public void StrudentInfo() {
        System.out.println("Nom : " + name);
        System.out.println("ID : " + studentId);
        System.out.println("Âge : " + age);
        System.out.println("Moyenne des notes : " + getAverageGrade());
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public int getStudentId(){
        return studentId;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
