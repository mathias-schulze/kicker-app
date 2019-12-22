package de.msz.kickerapp.web.rest.dashboard;

import java.util.ArrayList;
import java.util.List;

public class GameList {
	
	private List<Game> games = new ArrayList<>();
	
	public List<Game> getGames() {
		return games;
	}
	
	public void setGames(List<Game> games) {
		this.games = games;
	}
	
	public void addGame(Game game) {
		this.games.add(game);
	}
}
