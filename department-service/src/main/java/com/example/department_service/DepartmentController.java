package com.example.department_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @GetMapping
    public List<String> getDepartments() {
        return List.of("IT", "HR", "Finance");
    }
}