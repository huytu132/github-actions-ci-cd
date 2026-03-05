package org.example.githubactions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello, World!";
    }

    @GetMapping
    public String defaultEndpoint() {
        return "Welcome to the API!";
    }

    @GetMapping("/animals")
    public ResponseEntity<List<String>> getAnimals() {
        List<String> animals = List.of("Dog", "Cat", "Elephant", "Lion");
        return ResponseEntity.ok(animals);
    }
}
