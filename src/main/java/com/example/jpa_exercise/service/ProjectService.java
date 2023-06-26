package com.example.jpa_exercise.service;


import com.example.jpa_exercise.entity.Project;
import com.example.jpa_exercise.repositories.ProjectsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private  final ProjectsRepo projectsRepo;


    public ProjectService(ProjectsRepo projectsRepo) {
        this.projectsRepo = projectsRepo;
    }

    public List <Project> showAll(){
        return  projectsRepo.showAll();
    }
}
