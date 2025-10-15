package com.bertugkuturoglu.services;

import com.bertugkuturoglu.model.Employee;
import com.bertugkuturoglu.model.UpdateEmployeeRequest;
import com.bertugkuturoglu.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployeeList() {
        return employeeRepository.GetAllEmployeelist();

    }

    public List<Employee>getEmployeeWithParams(String firstName, String lastName){

        return employeeRepository.getEmployeelistWithParams(firstName,lastName);
    }

    public Employee saveEmployee(Employee newEmployee){
        return employeeRepository.saveEmployee(newEmployee);
    }

    public boolean deleteEmployee(String id){
        return employeeRepository.deleteEmployee(id);
    }

    public Employee updateEmployee(String id , UpdateEmployeeRequest request){
        return employeeRepository.updateEmployee(id,request);
    }
}
