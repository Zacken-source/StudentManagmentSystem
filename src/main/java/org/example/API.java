package org.example;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api") // URL de base pour l'API
public class API {

    private List<String> classs = new ArrayList<>(Arrays.asList("Student", "Enrollment", "Course"));

    // Récupérer tous les produits (GET)
    @GetMapping
    public List<String> getAllProducts() {
        return classs;
    }

    // Ajouter un produit (POST)
    @PostMapping
    public String addProduct(@RequestBody String product) {
        classs.add(product);
        return "Produit ajouté : " + product;
    }

    // Supprimer un produit (DELETE)
    @DeleteMapping("/{index}")
    public String deleteProduct(@PathVariable int index) {
        if (index >= 0 && index < classs.size()) {
            return "Produit supprimé : " + classs.remove(index);
        } else {
            return "Index invalide";
        }
    }
}
