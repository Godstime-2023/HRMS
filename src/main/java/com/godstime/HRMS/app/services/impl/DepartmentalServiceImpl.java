package com.godstime.HRMS.app.services.impl;

import com.godstime.HRMS.app.entities.Department;
import com.godstime.HRMS.app.exceptions.DepartmentNotFoundException;
import com.godstime.HRMS.app.repository.DepartmentRepository;
import com.godstime.HRMS.app.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentalServiceImpl implements DepartmentService {


    private final DepartmentRepository departmentRepository;


    @Autowired
    public DepartmentalServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findByName(String name) {
        Department department = departmentRepository.findByName(name);
        if (department == null) {
            throw new DepartmentNotFoundException(name);
        }
        return department;
    }


    @Override
    public List<Department> findByManagerId(Long managerId) {
        List<Department> departments = departmentRepository.findByManagerId(managerId);
        if (departments.isEmpty()) {
            throw new DepartmentNotFoundException(managerId);
        }
        return departments;
    }

    @Override
    public Department findByLocation(String location) {
        Department department = departmentRepository.findByLocation(location);
        if (department == null) {
            throw new DepartmentNotFoundException(location);
        }
        return department;
    }

    @Override
    public Department findById(Long id) {
        return departmentRepository.findById(id).orElseThrow(() -> new DepartmentNotFoundException(id));
    }
}







//    @Override
//    public Department save(Department department) {
//        return departmentRepository.save(department);
//    }
//
//    @Override
//    public void delete(Department department) {
//        departmentRepository.delete(department);
//    }
//}
