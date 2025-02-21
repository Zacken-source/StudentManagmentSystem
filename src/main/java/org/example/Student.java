package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private int studentId = 0;
    private int age;
    private  ArrayList<Integer> grades;

    public Student() {
        this.name = "John";
        this.studentId = 0;
        this.age = 10;
        this.grades = new ArrayList<Integer>(Arrays.asList(10, 20, 15));
    }

    public Student(String name, int studentId, int age) {
        this.name = name;
        this.studentId = 1;
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
