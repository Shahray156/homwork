package com.example.homwork;


import com.example.homwork.Employee.Employee;
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
    public String add(@RequestParam String name, @RequestParam String name1) {
Employee result = employeeService.add(name, name1);
return generateMessage(result, "создан");
    }
@GetMapping("/remove")
    public String remove(@RequestParam String name, @RequestParam String name1) {
        Employee result = employeeService.remove(name, name1);
    return generateMessage(result, "удален");
}
@GetMapping("/find")
    public Employee find(@RequestParam String name, @RequestParam String name1) {
        return employeeService.find(name,name1);
}
private String generateMessage(Employee employee, String status) {
        return String.format("Сотрудник %s %s %s.",
        employee.getName(),
        employee.getName1(),
      status
              );
}
}

