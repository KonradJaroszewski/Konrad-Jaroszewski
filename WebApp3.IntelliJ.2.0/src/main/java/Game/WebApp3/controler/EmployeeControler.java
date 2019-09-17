package Game.WebApp3.controler;
import java.util.*;

import javax.validation.Valid;


import Game.WebApp3.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Game.WebApp3.repository.EmployeeRepository;

@CrossOrigin (origins =  "http://localhost:4200")
@RestController
@RequestMapping("/employee")
public class EmployeeControler {
    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping("/all")//wyszukanie wszystkich uzytkoników//
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add );
        return employees;
    }

    @GetMapping("/{id}")//wyszukanie uzytkownika po ID//
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElse(null);

        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/create")//tworzenie nowego uzytkownika//
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        employee.setName("name");
        employee.setSurname("surname");
        employee.setUsername("Username");
        employee.setPassword("Password");

        return employeeRepository.save(employee);
    }

    @PutMapping("/update/{id}")//edytowanie uzytkonika//
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

    @DeleteMapping("/delete/id")//usuwanie jednego//
    public  Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElse(null);
        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
    @GetMapping("/delete-all")//usuwanie wszystkich//
    public String deleteAll() {
        employeeRepository.deleteAll();

        return "deleted";
    }



    @GetMapping("/save")//dodawanie 3 przykładowych rekordów//
    public String saveAll() {
        employeeRepository.saveAll(Arrays.asList(new Employee ("PKrol", "Pawel", "Krol","{noop}Krol123")
                , new Employee("KJaro", "Konrad","Jaroszewski","{noop}Jaro123")
                , new Employee("OSkib", "Oliwia","Skiba","{noop}Skib123" )));
        return "save";
    }
}

