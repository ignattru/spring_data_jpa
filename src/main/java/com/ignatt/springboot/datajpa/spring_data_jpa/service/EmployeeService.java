package com.ignatt.springboot.datajpa.spring_data_jpa.service;



import com.ignatt.springboot.datajpa.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
