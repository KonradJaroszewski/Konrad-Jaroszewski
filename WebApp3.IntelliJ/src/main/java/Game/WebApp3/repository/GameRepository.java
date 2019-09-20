package Game.WebApp3.repository;
import Game.WebApp3.Games.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GameRepository extends JpaRepository<Games,Long>{
}
