package com.godstime.HRMS.app.repository;

import com.godstime.HRMS.app.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
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
}
