package com.godstime.HRMS.app.services;

import com.godstime.HRMS.app.entities.Position;
import com.godstime.HRMS.app.exceptions.PositionNotFoundException;

import java.util.List;

public interface PositionService {

    Position findById(Long id) throws PositionNotFoundException;
    Position findByName(String name) throws PositionNotFoundException;
    List<Position> findByDepartmentId(Long departmentId) throws PositionNotFoundException;
    List<Position> findByEmployeeId(Long employeeId) throws PositionNotFoundException;
    List<Position> findAll();
    List<Position> findByEmployeeCount();
    List<Position> findByEmployeeCount(Long departmentId);
    Position save(Position position);
    Position update(Position position);
    void delete(Long id);

}
