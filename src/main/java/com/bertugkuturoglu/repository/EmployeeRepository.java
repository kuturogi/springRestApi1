package com.bertugkuturoglu.repository;

import com.bertugkuturoglu.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;

    public List<Employee> GetAllEmployeelist() {
        return employeeList;
    }

    public List<Employee> getEmployeelistWithParams(String firstName , String lastName) {
        List<Employee> employeeWithParams = new ArrayList<>();

        if (firstName==null && lastName==null){
            return employeeList;
        }
        for (Employee employee : employeeList) {
            if (firstName!=null && lastName!= null){
                if (employee.getFirstName().equalsIgnoreCase(firstName)&& employee.getLastName().equalsIgnoreCase(lastName)){
                    employeeWithParams.add(employee);
                }
            }
            if (firstName!=null && lastName==null){
                if (employee.getFirstName().equalsIgnoreCase(firstName)){
                    employeeWithParams.add(employee);
                }
            }
            if (firstName==null && lastName!=null){
               if (employee.getLastName().equalsIgnoreCase(lastName)){
                   employeeWithParams.add(employee);
               }
            }


        }
        return employeeWithParams;
    }
}
