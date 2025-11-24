package org.project.adapter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class EmployeeAdapter implements ITarget {
    private final BillingSystem thirdPartyBillingSystem = new BillingSystem();

    @Override
    public void processCompanySalary(String[][] employeesArray) {
        var employees = Arrays.stream(employeesArray == null ? new String[0][] : employeesArray)
                .filter(Objects::nonNull)
                .filter(data -> data.length >= 4)
                .map(data -> new Employee(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2],
                        new BigDecimal(data[3])
                ))
                .toList();

        thirdPartyBillingSystem.processSalary(employees);
    }
}
