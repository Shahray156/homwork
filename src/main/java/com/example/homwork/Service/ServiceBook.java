package com.example.homwork.Service;

import com.example.homwork.Model.Employee;

import java.util.Collection;

public interface ServiceBook {
    Employee add(String firstName, String lastName);

    Employee add(Employee employee);

    Employee remove(String firstName, String lastName);

    Employee remove(Employee employee);

    Employee find(String firstName, String lastName);

    Collection<Employee> getAll();
}
