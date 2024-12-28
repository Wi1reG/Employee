import com.example.demo.exception.EmloyeeAlreadyAddedException;
import com.example.demo.exception.EmloyeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
public class EmployeeService implements EmployeeServiceImp {


    private final List<Employee> employeeList;

    public EmployeeService() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            throw new EmloyeeAlreadyAddedException();
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee delete(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
        }
        throw new EmloyeeNotFoundException();

    }

    @Override
    public Employee find(String firstName, String lastName) {
                                                                                                                                    
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            return employee;
        }

        throw new EmloyeeNotFoundException();
    }

    @Override 
    public Collection<Employee> findAll() {
        return new ArrayList<>(employeeList);
    }
}
