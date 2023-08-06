package de.msz.kickerapp.web.rest;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.msz.kickerapp.domain.Player;
import de.msz.kickerapp.service.FirestoreService;
import de.msz.kickerapp.web.rest.dashboard.Game;
import de.msz.kickerapp.web.rest.dashboard.GameList;

/**
 * DashboardResource controller
 */
@RestController
@RequestMapping("/api/dashboard")
public class DashboardResource {
	
    private final Logger log = LoggerFactory.getLogger(DashboardResource.class);
    
    @Autowired
    private FirestoreService db;
    
    @GetMapping("/last-games")
    public GameList lastGames() {
    	
    	GameList games = new GameList();

    	Game game1 = new Game();
    	game1.setPlayer1("Mathias");
    	game1.setPlayer2("Norbert");
    	games.addGame(game1);

    	Game game2 = new Game();
    	game2.setPlayer1("Mathias");
    	game2.setPlayer2("Nikolai");
    	games.addGame(game2);
    	
        return games;
    }
    
    @GetMapping("/ranking")
    public Collection<Player> getRanking() {
    	return null;//db.getPlayers().values();
    }
}
