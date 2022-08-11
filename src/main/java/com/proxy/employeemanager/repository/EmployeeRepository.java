package com.proxy.employeemanager.repository;

import com.proxy.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteEmployeeById();

    Optional<Employee> findEmployeeById(Long id);
}
