package Game.WebApp3.controler;
import java.util.*;

import javax.validation.Valid;


import Game.WebApp3.model.Employee;

/*import Game.WebApp3.model.User;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Game.WebApp3.repository.EmployeeRepository;

@CrossOrigin (origins =  "http://localhost:4200")
@RestController
@RequestMapping("/employee")
public class EmployeeControler {
    @Autowired
    private EmployeeRepository employeeRepository;
   /* @GetMapping(produces="aplication/json")
    @RequestMapping({"/validateLogin"})
   *//* public User validateLogin(){
        return new User("Employee successfully authenticated");
    }*/

    @GetMapping("/all")//wyszukanie wszystkich uzytkoników//
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        for (Employee employee : employeeRepository.findAll()) {
            employeeRepository.findAll().forEach(employees::add );
            return employees;
        }


        return employees;
    }

    @GetMapping("/{id}")//wyszukanie uzytkownika po ID//
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElse(null);

        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/create")//tworzenie nowego uzytkownika//
    public Employee createEmployee( @RequestBody Employee employee) {
        employeeRepository.save(employee);

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
    public  ResponseEntity<String> deleteEmployee(@PathVariable(value = "id") Long id) {
        System.out.println("delete Employee with ID="+ id +"...");
        employeeRepository.deleteById(id);
        return new ResponseEntity<>("employee has been deleted!", HttpStatus.OK);
    }
    @GetMapping("/delete-all")//usuwanie wszystkich//
    public String deleteAll() {
        employeeRepository.deleteAll();

        return "deleted";
    }



    @GetMapping("/save")//dodawanie 3 przykładowych rekordów//
    public String saveAll() {
        employeeRepository.saveAll(Arrays.asList(new Employee ("PKrol", "Pawel", "Krol","{noop}Krol123","ADMIN")
                , new Employee("KJaro", "Konrad","Jaroszewski","{noop}Jaro123","USER")
                , new Employee("OSkib", "Oliwia","Skiba","{noop}Skib123" ,"USER")));
        return "save";
    }
}

