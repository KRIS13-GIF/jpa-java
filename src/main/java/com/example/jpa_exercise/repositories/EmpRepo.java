package com.example.jpa_exercise.repositories;

import com.example.jpa_exercise.entity.Department;
import com.example.jpa_exercise.entity.Employee;
import com.example.jpa_exercise.entity.Project;
import com.example.jpa_exercise.enumerations.DepartmentName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepo extends JpaRepository<Employee, String> {
    List<Employee> findAllByFname(String name);

    @Query(nativeQuery = true, value = "SELECT * FROM sample.employee")
    List <Employee> showAll();

    @Query(nativeQuery = true, value = "SELECT * from sample.employee WHERE fname  LIKE 'J%'")
    List <Employee> findNameStartJ();


    // JPA
    List<Employee>findAllByDepartmentNull();
    List<Employee>findAllByDepartmentName(DepartmentName name);
}
