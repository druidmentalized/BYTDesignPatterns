package org.project.adapter;

import java.util.List;

public class BillingSystem {

    public void processSalary(List<Employee> employees) {
        for (var employee : employees) {
            IO.println("Rs." + employee.salary() + " Salary Credited to " + employee.name() + " Account");
        }
    }
}
