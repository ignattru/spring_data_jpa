package com.ignatt.springboot.datajpa.spring_data_jpa.dao;



import com.ignatt.springboot.datajpa.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
