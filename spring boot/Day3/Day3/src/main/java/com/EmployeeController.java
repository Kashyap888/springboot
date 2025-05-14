package com;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.validation.Valid;
@RequestMapping("/api/employees")
@RestController
public class EmployeeController {
     private final Map<Integer, Employee> employeeMap = new HashMap<>();
 
      // POST - create new employee
        @PostMapping // http://localhost:8080/api/employees
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee) {
        employeeMap.put(employee.getId(), employee);
        System.out.println(employee);
        // Save all employees to a single JSON file
        ObjectMapper mapper = new ObjectMapper();
        try {
            File file = new File("./all_employees.json");
            mapper.writerWithDefaultPrettyPrinter().writeValue(file, employeeMap.values());
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        return ResponseEntity.status(201).body(employee);
    }
}
