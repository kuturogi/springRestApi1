package com.bertugkuturoglu.Config;

import com.bertugkuturoglu.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","bertug", "kuturoglu"));
        employeeList.add(new Employee("2","ab", "kuturoglu"));
        employeeList.add(new Employee("3","bc", "kuturoglu"));
        employeeList.add(new Employee("4","cd", "kuturoglu"));
        employeeList.add(new Employee("5","de", "kuturoglu"));
        employeeList.add(new Employee("6","ef", "kuturoglu"));
        return employeeList;
    }
}
