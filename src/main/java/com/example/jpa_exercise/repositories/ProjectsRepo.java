
package com.example.jpa_exercise.repositories;


import com.example.jpa_exercise.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectsRepo extends JpaRepository<Project, String> {
    @Query(nativeQuery = true, value = "SELECT * FROM sample.project")// do it with findAll
    List <Project> showAll();
}
