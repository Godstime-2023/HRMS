package com.godstime.HRMS.app.services.impl;

import com.godstime.HRMS.app.entities.Position;
import com.godstime.HRMS.app.exceptions.PositionNotFoundException;
import com.godstime.HRMS.app.repository.PositionRepository;
import com.godstime.HRMS.app.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    private final PositionRepository positionRepository;

    @Autowired
    public PositionServiceImpl(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @Override
    public Position findById(Long id) throws PositionNotFoundException {
        return positionRepository.findById(id)
                .orElseThrow(() -> new PositionNotFoundException("Position with id " + id + " not found"));

    }

    @Override
    public Position findByName(String name) throws PositionNotFoundException {
        Position position = positionRepository.findByName(name);
        if (position == null) {
            throw new PositionNotFoundException("Position with name " + name + " not found");
        }
        return position;
    }

    @Override
    public List<Position> findByDepartmentId(Long departmentId) throws PositionNotFoundException {
        List<Position> positions = positionRepository.findByDepartmentId(departmentId);
        if (positions.isEmpty()) {
            throw new PositionNotFoundException("Position with department id " + departmentId + " not found");
        }
        return positions;
    }

    @Override
    public List<Position> findByEmployeeId(Long employeeId) throws PositionNotFoundException {
        List<Position> positions = positionRepository.findByEmployeeId(employeeId);
        if (positions.isEmpty()) {
            throw new PositionNotFoundException("Position with employee id " + employeeId + " not found");
        }
        return positions;

    }

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public List<Position> findByEmployeeCount() {
        return null;
    }

    @Override
    public List<Position> findByEmployeeCount(Long departmentId) {
        return null;
    }

    @Override
    public Position save(Position position) {
        return null;
    }

    @Override
    public Position update(Position position) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

//    @Override
//    public Position findById(Long id) throws PositionNotFoundException {
//        return positionRepository.findById(id).orElseThrow(() -> new PositionNotFoundException("Position with id " + id + " not found"));
//    }
//
//    @Override
//    public Position findByName(String name) throws PositionNotFoundException {
//        Position position = positionRepository.findByName(name);
//        if (position == null) {
//            throw new PositionNotFoundException("Position with name " + name + " not found");
//        }
//        return position;
//    }
//
//    @Override
//    public List<Position> findByDepartmentId(Long departmentId) throws PositionNotFoundException {
//        List<Position> positions = positionRepository.findByDepartmentId(departmentId);
//        if (positions.isEmpty()) {
//            throw new PositionNotFoundException("Position with department id " + departmentId + " not found");
//        }
//        return positions;
//    }
//
//    @Override
//    public List<Position> findByEmployeeId(Long employeeId) throws PositionNotFoundException {
//        List<Position> positions = positionRepository.findByEmployeeId(employeeId);
//        if (positions.isEmpty()) {
//            throw new PositionNotFoundException("Position with employee id " + employeeId + " not found");
//        }
//        return positions;
//    }
//
//    @Override
//    public List<Position> findAll() {
//        return positionRepository.findAll();
//    }
//
//    @Override
//    public List<Position> findByEmployeeCount() {
//        return positionRepository.findByEmployeeCount();
//    }
//
//    @Override
//    public List<Position> findByEmployeeCount(Long departmentId) {
//        return positionRepository.findByEmployeeCount(departmentId);
//    }
//
//    @Override
//    public Position save(Position position) {
//        return positionRepository.save(position);
//    }
//
//    @Override
//    public Position update(Position position) {
//        return positionRepository.save(position);
//    }
//
//    @Override
//    public void delete(Long id) {
//        positionRepository.deleteById(id);
//    }
//}


}