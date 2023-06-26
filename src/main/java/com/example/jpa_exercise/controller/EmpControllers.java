package com.example.jpa_exercise.controller;

import com.example.jpa_exercise.entity.Employee;
import com.example.jpa_exercise.enumerations.DepartmentName;
import com.example.jpa_exercise.service.EmpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpControllers {

    private final EmpService empService;

    public EmpControllers(EmpService empService) {
        this.empService = empService;
    }


    @GetMapping("/employeeName")
    public List<Employee> findAllByName(
            @RequestParam("fname") String name
    ){
        return empService.findAllByName(name);
    }

    @GetMapping("/employee")
    public List<Employee>showAll(){
        return empService.showAll();
    }

   @GetMapping("/empJ") 
    public List<Employee>findNameStartJ(){
        return empService.findNameStartJ();
   }


   @GetMapping("/emp/depNo")
    public List<Employee>getEmployeeWithoutDep(){
        return empService.getEmployeeWithoutDep();
   }

   @GetMapping("/emp/depname")
    public List<Employee>getEmployeeWithDepartment(@RequestParam("name")DepartmentName name){
        return empService.getEmployeeWithDepartment(name);
   }

}
