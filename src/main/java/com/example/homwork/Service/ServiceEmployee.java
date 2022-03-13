package com.example.homwork.Service;

import com.example.homwork.Model.Employee;
import com.example.homwork.exceptions.ExistsException;
import com.example.homwork.exceptions.NotFound;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ServiceEmployee implements ServiceBook {
    private final List<Employee> employeesList;
    //  private int size;
    // private Employee newEmployee;

    public ServiceEmployee() {
        employeesList = new ArrayList<>();
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee newEmployee = new Employee(firstName, lastName);
        return add(newEmployee);
    }


    @Override
    public Employee add(Employee employee) {
        if (!employeesList.contains(employee)) {
            throw new ExistsException();
        }
        employeesList.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee newEmployee = new Employee(firstName, lastName);
        return remove(newEmployee);
    }

    @Override
    public Employee remove(Employee employee) {
        if (!employeesList.remove(employee)) {
            throw new NotFound();
        }
        employeesList.remove(employee);
        return employee;
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employeesList.contains(employee)) {
            throw new NotFound();
        }
      return employee;
    }

    @Override
    public Collection <Employee> getAll() {
        return List.copyOf(employeesList);
    }
}
