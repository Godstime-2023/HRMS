package com.godstime.HRMS.app.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "positions")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "salary")
    private Double salary;

    @OneToMany(mappedBy = "position")
    private List<Employee> employees;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int countEmployees() {
        return employees.size();
    }

    public double calculateTotalSalary() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }
}

