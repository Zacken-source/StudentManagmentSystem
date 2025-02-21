package org.example;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api") // URL de base pour l'API
public class API {
    private School ynov = new School();

    // Récupérer l'école (GET)
    @GetMapping
    public School getSchool(School school) {
        return school;
    }

    // Add a Student (POST)
    @PostMapping("/student/POST")
    public String addStudent(@RequestBody Student student, Course course) {
        course.enrollStudent(student);
        return "Ajout de l'étudiant : " + student;
    }

    // Add a course  (POST)
    @PostMapping("/course/POST")
    public String addCourse(@RequestBody Course course, School school) {
        school.addCourses(course);
        return "cours ajouté : " + course;
    }
    /* Add an Enrollment  (POST)
    @PostMapping("/enrollment/POST")
    public String addEnrollment(@RequestBody String product) {
        poo.;
        return "lien ajouté : " + product;
    }*/
    // Add a grade  (POST)
    @PostMapping("/grade/POST")
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