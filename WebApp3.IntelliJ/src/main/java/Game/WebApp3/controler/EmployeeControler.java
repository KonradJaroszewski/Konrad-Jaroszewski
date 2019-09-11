package Game.WebApp3.controler;
import java.util.*;

import javax.validation.Valid;


import Game.WebApp3.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Game.WebApp3.repository.EmployeeRepository;
@RestController
@RequestMapping("/api/")
public class EmployeeControler {
    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        for (Employee employee : employeeRepository.findAll()) {
            employees.add(new Employee(employee.getUsername(), employee.getName(), employee.getSurname(), employee.getPassword()));
        }
        return employees;
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElse(null);

        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/create")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
                                                   @Valid @RequestBody Employee employeeDetails) {
        Employee employee = employeeRepository.findById(employeeId).orElse(null);

        employee.setName(employee.getName());
        employee.setSurname(employee.getSurname());
        employee.setUsername(employee.getUsername());
        employee.setPassword(employee.getPassword());
        final Employee updatedEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);

    }

    @DeleteMapping("/delete/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElse(null);
        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @GetMapping("/save")
    public String saveAll() {
        employeeRepository.saveAll(Arrays.asList(new Employee ("Pawel", "Krol")
                , new Employee("Konrad", "Jaroszewski")
                , new Employee("Oliwia", "Skiba")));
        return "";
    }
}

