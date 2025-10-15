package com.bertugkuturoglu.controller;

import com.bertugkuturoglu.model.Employee;
import com.bertugkuturoglu.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping(path = "/list")
    public List<Employee> getAllEmployeeList() {
       return  employeeService.getAllEmployeeList();

    }

    @GetMapping(path = "/with-params")
    public  List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName", required = false) String firstName
                                                 , @RequestParam(name = "lastName" , required = false) String lastName ) {
        return employeeService.getEmployeeWithParams(firstName, lastName);
    }





}
