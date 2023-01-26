package com.godstime.HRMS.app.services.impl;

import com.godstime.HRMS.app.entities.Department;
import com.godstime.HRMS.app.entities.Employee;
import com.godstime.HRMS.app.entities.Position;
import com.godstime.HRMS.app.repository.EmployeeRepository;
import com.godstime.HRMS.app.services.DepartmentService;
import com.godstime.HRMS.app.services.EmployeeService;
import com.godstime.HRMS.app.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepository employeeRepository;
    private final PositionService positionService;
    private final DepartmentService departmentService;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, PositionService positionService, DepartmentService departmentService) {
        this.employeeRepository = employeeRepository;
        this.positionService = positionService;
        this.departmentService = departmentService;
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> findByDepartment(Long departmentId) {
        Department department = departmentService.findById(departmentId);
        return employeeRepository.findByDepartmentId(departmentId);
      //  return null;
    }

    @Override
    public List<Employee> findByPosition(Long positionId) {

       // Position position = positionService.findById(positionId);
        return employeeRepository.findByPositionId(positionId);

    }

    @Override
    public List<Employee> findByFirstName(String firstName) {
        return null;
    }

    @Override
    public List<Employee> findByLastName(String lastName) {
        return null;
    }

    @Override
    public List<Employee> findByDepartmentId(Long departmentId) {
        return null;
    }

    @Override
    public List<Employee> findByPositionId(Long positionId) {
        return null;
    }

    @Override
    public List<Employee> findBySalaryGreaterThan(double salary) {
        return null;
    }

    @Override
    public List<Employee> findByHireDateAfter(LocalDate hireDate) {
        return null;
    }

    @Override
    public List<Employee> findByHireDateBefore(LocalDate hireDate) {
        return null;
    }

    @Override
    public List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate) {
        return null;
    }

    @Override
    public List<Employee> findByTerminated(boolean terminated) {
        return null;
    }

    @Override
    public List<Employee> findByEmailContaining(String email) {
        return null;
    }

    @Override
    public List<Employee> findByPhoneNumberContaining(String phoneNumber) {
        return null;
    }

    @Override
    public Employee save(Employee employee) {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}


//    @Override
//    public List<Employee> findByDepartment(Long departmentId) {

//    }
//
//    @Override
//    public List<Employee> findByPosition(Long positionId) {

//    }
//
//    @Override
//    public List<Employee> findByFirstName(String firstName) {
//        return employeeRepository.findByFirstName(firstName);
//    }
//
//    @Override
//    public List<Employee> findByLastName(String lastName) {
//        return employeeRepository.findByLastName(lastName);
//    }
//
//    @Override
//    public List<Employee> findByDepartmentId(Long departmentId) {
//        return employeeRepository.findByDepartmentId(departmentId);
//    }
//
//    @Override
//    public List<Employee> findByPositionId(Long
