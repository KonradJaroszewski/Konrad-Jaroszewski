package Game.WebApp3.controler;
import Game.WebApp3.Games.Games;
import Game.WebApp3.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.List;
@CrossOrigin (origins =  "http://localhost:4200")
@RestController
@RequestMapping("/game")
public class GameControler {
private GameRepository gameRepository;
@Autowired
    @GetMapping("/all")
    public List<Games> getAllGames() {
        List<Games> games = new ArrayList<>();
        for (Games  : gameRepository.findAll()) {
            gameRepository.findAll().forEach(games::add );
            return games;
        }
        return  games;
}
