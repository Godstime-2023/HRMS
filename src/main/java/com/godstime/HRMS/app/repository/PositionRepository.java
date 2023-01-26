package com.godstime.HRMS.app.repository;

import com.godstime.HRMS.app.entities.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {

    Optional<Position> findById(Long id);
    Position findByName(String name);
    List<Position> findByDepartmentId(Long departmentId);
    List<Position> findByEmployeeId(Long employeeId);
}
