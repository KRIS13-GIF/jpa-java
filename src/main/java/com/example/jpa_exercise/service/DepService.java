package com.example.jpa_exercise.service;

import com.example.jpa_exercise.repositories.DepRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DepService {
    private final DepRepo departmentRepository;

    public DepService(DepRepo departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    public List<Map<String,String>> findEmployeesDepartments(){
        return departmentRepository.getEmployeesByDepartment();
    }

    public List<String>getEmployeeOutDepartment(){
        return departmentRepository.getEmployeeOutDepartment();
    }

}
