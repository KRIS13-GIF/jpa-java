package com.example.jpa_exercise.service;

import com.example.jpa_exercise.entity.Employee;
import com.example.jpa_exercise.enumerations.DepartmentName;
import com.example.jpa_exercise.repositories.EmpRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    private final EmpRepo empRepo;

    public EmpService(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }

    public List<Employee>findAllByName(String name){
        if(name != null){
            return empRepo.findAllByFname(name);
        } else {
            return null;
        }
    }


    public List <Employee> findNameStartJ(){
        return empRepo.findNameStartJ();
    }

    public List<Employee>showAll(){
        return empRepo.showAll();
    }

    public List<Employee> getEmployeeWithDepartment(DepartmentName name){
        return empRepo.findAllByDepartmentName(name);
    }

    public List<Employee>getEmployeeWithoutDep(){
        return empRepo.findAllByDepartmentNull();
    }



}
