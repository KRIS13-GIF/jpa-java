package com.example.jpa_exercise.repositories;

import com.example.jpa_exercise.entity.Department;
import com.example.jpa_exercise.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public interface DepRepo extends JpaRepository<Department, String> {




    // This join here selects the employee and the department name which are linked through a common id
    @Query(nativeQuery = true, value = "SELECT d.name AS department_name, e.fname AS employee_name FROM sample.department d INNER JOIN sample.employee e ON d.empid = e.id")
    List<Map<String, String>> getEmployeesByDepartment();


    // This join here should link
    @Query(nativeQuery = true, value = "SELECT  e.fname  from sample.employee AS e LEFT JOIN sample.department AS d ON d.empid = e.id WHERE d.empid is null")
    List<String>getEmployeeOutDepartment();



}
