package com.example.homwork.Controller;


import com.example.homwork.Model.Employee;
import com.example.homwork.Service.ServiceEmployee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")

public class EmpoyeeBook {
    private final ServiceEmployee employeeService;

    public EmpoyeeBook(ServiceEmployee employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public String add(@RequestParam String firstName, @RequestParam String lastName) {
        Employee result = employeeService.add(firstName, lastName);
        return generateMessage(result, "создан");
    }

    @GetMapping("/remove")
    public String remove(@RequestParam String firstName, @RequestParam String lastName) {
        Employee result = employeeService.remove(firstName, lastName);
        return generateMessage(result, "удален");
    }

    @GetMapping("/find")
    public Employee find(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.find(firstName, lastName);
    }

    private String generateMessage(Employee employee, String status) {
        return String.format("Сотрудник %s %s %s.",
                employee.getFirstName(),
                employee.getLastName(),
                status
        );
    }
}

