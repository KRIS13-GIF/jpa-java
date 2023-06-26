package com.example.jpa_exercise.controller;


import com.example.jpa_exercise.entity.Project;
import com.example.jpa_exercise.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectControllers {
    private final ProjectService projectService;


    public ProjectControllers(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    public List <Project> showAll(){
        return projectService.showAll();
    }

}
