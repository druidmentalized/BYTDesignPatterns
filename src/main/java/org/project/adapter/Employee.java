package org.project.adapter;

import java.math.BigDecimal;

public record Employee(int id, String name, String designation, BigDecimal salary) {
}
