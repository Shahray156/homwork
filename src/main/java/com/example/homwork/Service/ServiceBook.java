package com.example.homwork.Service;

import com.example.homwork.Model.Employee;

public interface ServiceBook {
    Employee add(String firstName, String lastName);

    Employee add(Employee employee);

    Employee remove(String firstName, String lastName);

    Employee remove(Employee employee);

    Employee find(String firstName, String lastName);
}
