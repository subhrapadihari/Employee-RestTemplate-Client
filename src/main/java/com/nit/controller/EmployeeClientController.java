package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Employee;
import com.nit.service.EmployeeClientService;

@RestController
@RequestMapping("/client")
public class EmployeeClientController {

    @Autowired
    private EmployeeClientService service;


    // CREATE
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(
            @RequestBody Employee emp) {

        Employee employee =
                service.addEmployee(emp);

        return new ResponseEntity<>(
                employee,
                HttpStatus.CREATED);
    }


    // GET ALL
    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAllEmployees() {

        List<Employee> employees =
                service.getAllEmployees();

        return new ResponseEntity<>(
                employees,
                HttpStatus.OK);
    }


    // GET BY ID
    @GetMapping("get/{id}")
    public ResponseEntity<Employee> getEmployeeById(
            @PathVariable Long id) {

        Employee employee =
                service.getEmployeeById(id);

        return new ResponseEntity<>(
                employee,
                HttpStatus.OK);
    }


    // UPDATE
    @PutMapping("update/{id}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable Long id,
            @RequestBody Employee emp) {

        Employee employee =
                service.updateEmployee(id, emp);

        return new ResponseEntity<>(
                employee,
                HttpStatus.OK);
    }


    // DELETE
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteEmployee(
            @PathVariable Long id) {

        service.deleteEmployee(id);

        return new ResponseEntity<>(
                "Employee deleted successfully",
                HttpStatus.OK);
    }
}