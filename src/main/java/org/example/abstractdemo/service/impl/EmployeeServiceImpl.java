package org.example.abstractdemo.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.abstractdemo.dto.request.EmployeeRequest;
import org.example.abstractdemo.dto.response.EmployeeResponse;
import org.example.abstractdemo.model.Employee;
import org.example.abstractdemo.repository.EmployeeRepository;
import org.example.abstractdemo.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee save(EmployeeRequest request) {
        Employee employee = new Employee();
        employee.setName(request.name());
        employee.setCompany(request.companyName());
        employee.setAge(request.age());
        employee.setSalary(request.salary());

        return employeeRepository.save(employee);
    }

    @Override
    public EmployeeResponse getById(Integer id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
        return EmployeeResponse.builder()
                .id(employee.getId())
                .name(employee.getName())
                .companyName(employee.getCompany())
                .age(employee.getAge())
                .salary(employee.getSalary())
                .build();
    }
}
