package org.project.adapter;

import java.math.BigDecimal;

public class Employee {
    private final int id;
    private final String name;
    private final String designation;
    private final BigDecimal salary;

    public Employee(int id, String name, String designation, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
