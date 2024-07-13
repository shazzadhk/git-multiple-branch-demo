package org.example.abstractdemo.controller;

import lombok.RequiredArgsConstructor;
import org.example.abstractdemo.dto.request.EmployeeRequest;
import org.example.abstractdemo.model.Employee;
import org.example.abstractdemo.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody EmployeeRequest request) {
        return employeeService.save(request);
    }
}
