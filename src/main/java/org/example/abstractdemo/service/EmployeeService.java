package org.example.abstractdemo.service;

import org.example.abstractdemo.dto.request.EmployeeRequest;
import org.example.abstractdemo.model.Employee;

public interface EmployeeService {
    Employee save(EmployeeRequest request);
}
