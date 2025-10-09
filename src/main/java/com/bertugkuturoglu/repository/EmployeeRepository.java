package com.bertugkuturoglu.repository;

import com.bertugkuturoglu.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;

    public List<Employee> GetAllEmployeelist() {
        return employeeList;
    }
    
    

}
