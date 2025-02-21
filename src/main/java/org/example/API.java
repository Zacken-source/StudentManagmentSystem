package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api") // URL de base pour l'API
public class API {
    private School ynov = new School();

    // Récupérer l'école (GET)
    @GetMapping
    public ResponseEntity<School> getSchool() {
        System.out.println("schoolg");
        return ResponseEntity.ok(ynov);
    }
    @GetMapping("/courses")
    public Course getCourse(Course course) {
        System.out.println("courseg");
        return course;
    }
    @GetMapping("/students")
    public Student getStudent(Student student) {
        System.out.println("studentg");
        return student;
    }




    // Add a Student (POST)
    @PostMapping("/students")
    public String addStudent(@RequestBody Student student, Course course) {
        course.enrollStudent(student);
        System.out.println("studentp");
        return "Ajout de l'étudiant : " + student;
    }

    // Add a course  (POST)
    @PostMapping("/courses")
    public String addCourse(@RequestBody Course course, School school) {
        school.addCourses(course);
        System.out.println("coursep");
        return "cours ajouté : " + course;
    }
    /* Add an Enrollment  (POST)
    @PostMapping("/enrollment")
    public String addEnrollment(@RequestBody String product) {
        poo.;
        return "lien ajouté : " + product;
    }*/
    // Add a grade  (POST)
    @PostMapping("/grades")
    public String addGrade(@RequestBody int grade, Student student) {
        student.addGrade(grade);
        return "note ajoutée : " + grade;
    }}
/*
    // Supprimer un produit (DELETE)
    @DeleteMapping("/{index}")
    public String deleteProduct(@PathVariable int index) {
        if (index >= 0 && index < poo.size()) {
            return "Produit supprimé : " + poo.remove(index);
        } else {
            return "Index invalide";
        }
    }
}
*/