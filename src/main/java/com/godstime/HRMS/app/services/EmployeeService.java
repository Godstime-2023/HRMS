package com.godstime.HRMS.app.services;

import com.godstime.HRMS.app.entities.Employee;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeService {

    Employee findById(Long id);
    List<Employee> findAll();
    List<Employee> findByDepartment(Long departmentId);
    List<Employee> findByPosition(Long positionId);
    List<Employee> findByFirstName(String firstName);
    List<Employee> findByLastName(String lastName);
    List<Employee> findByDepartmentId(Long departmentId);
    List<Employee> findByPositionId(Long positionId);
    List<Employee> findBySalaryGreaterThan(double salary);
    List<Employee> findByHireDateAfter(LocalDate hireDate);
    List<Employee> findByHireDateBefore(LocalDate hireDate);
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);
    List<Employee> findByTerminated(boolean terminated);
    List<Employee> findByEmailContaining(String email);
    List<Employee> findByPhoneNumberContaining(String phoneNumber);
    Employee save(Employee employee);
    Employee update(Employee employee);
    void delete(Long id);
}
//