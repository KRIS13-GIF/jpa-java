package com.example.jpa_exercise.controller;

import com.example.jpa_exercise.service.DepService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DepoController {

    private final DepService depService;


    public DepoController(DepService depService) {
        this.depService = depService;
    }
    @GetMapping("/employee/department")
    public List<Map<String, String>> getDepartmentById(){
        return depService.findEmployeesDepartments();
    }

    @GetMapping("/employee/department/out")
    public List<String>getEmployeeOutDepartment(){
        return depService.getEmployeeOutDepartment();
    }






}