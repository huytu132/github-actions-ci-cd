package org.example.githubactions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
