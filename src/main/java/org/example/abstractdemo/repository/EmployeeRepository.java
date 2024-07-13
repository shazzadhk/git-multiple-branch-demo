package org.example.abstractdemo.repository;

import org.example.abstractdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
