package com.example.SpringbootApp1.service;

import com.example.SpringbootApp1.model.Employee;

public interface EmployeeService {
    Object getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
