import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")

public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee (@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.add(firstName, lastName);

    }

    @GetMapping("/delete")
    public Employee deleteEmployee (@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.delete(firstName, lastName);

    }

    @GetMapping("/find")
    public Employee findEmployee (@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.find(firstName, lastName);

    }

    @GetMapping
    public Collection<Employee> findAll() {
        return employeeService.findAll();

    }


}
