package Game.WebApp3.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Game.WebApp3.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee ,Long>{
}
