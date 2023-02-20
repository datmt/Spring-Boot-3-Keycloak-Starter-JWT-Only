package io.ukata.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/public")
@RestController
public class PublicController {

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
