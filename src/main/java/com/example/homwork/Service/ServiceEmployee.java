package com.example.homwork.Service;

import com.example.homwork.Employee.Employee;
import com.example.homwork.exceptions.EmployeeExceptions;
import com.example.homwork.exceptions.ExistsException;
import com.example.homwork.exceptions.NotFound;
import org.springframework.stereotype.Service;

@Service
public abstract class ServiceEmployee implements ServiceBook {
    private final Employee[] employees;
    private int size;
    private Employee newEmployee;

    public ServiceEmployee() {
        employees = new Employee[10];
    }

    @Override
    public Employee add(String name, String name1) {
        Employee newEmployee = new Employee(name, name1);
        return add(newEmployee);
    }


@Override
public Employee add(Employee employee) {
    if (size == employees.length) {
        throw new EmployeeExceptions();
    }
    int index = indexOf(employee);
    if (index != -1) {
        throw new ExistsException();
    }

    employees[size++] = employee;
    return employee;
}
@Override
public Employee remove(String name, String name1) {
    int index = indexOf(newEmployee);
    if (index != -1) {
       Employee result = employees[index];
       System.arraycopy(employees, index +1, employees, index, size - index);
       size--;
       return result;
    }
throw new NotFound();
}

@Override
public Employee find(String name, String name1) {
        Employee newEmployee = new Employee(name,name1);
        int index = indexOf(newEmployee);
        if(index != -1) {
            return employees[index];
        }
        throw new NotFound();
}
private int indexOf(Employee employee) {
    for (int i = 0; i < size; i++) {
        if (employees[i].equals(employee)) {
            return i;
        }
    }
    return -1;
}
}