package com.example.homwork.Employee;

import java.util.Objects;

public class Employee {

    private final String name;
    private final String name1;


    public Employee(String name, String name1) {
        this.name = name;
        this.name1 = name1;
    }

    @Override
    public boolean equals(Object o) {
        if (this== o) return true;
        if (!( o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && name1.equals(employee.name1);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, name1);
    }

    @Override
    public String toString() {
        return String.format("Сотрудник: %s, %s, %s", name, name1);
    }
    public String getName() {
        return name;
    }

    public String getName1() {
        return name1;
    }


}