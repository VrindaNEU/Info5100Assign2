package Classes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;

public class Game {
	
	enum GameType {
	    humanAndComputer, humanAndHuman
	}
	
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private GameType gameType;
	private Optional<Player> winner;
	private Boolean tie;
	private Integer roundNumber;
	private ArrayList<Player> players = new ArrayList<Player>();
	
	//Constructor
	
	public Game(LocalDateTime startTime, LocalDateTime endTime, GameType gameType, 
			Optional<Player> winner, Boolean tie, Integer roundNumber) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.gameType = gameType;
		this.winner = winner;
		this.tie = tie;
		this.roundNumber = roundNumber;
	}
	
	
	
	public Game() {
		super();
	}



	// Method to add a player to the game
	

	 public void addPlayers(GameType gameType, String username1, Boolean levelHigh, String username2  ) {
	        if (gameType == GameType.humanAndComputer) {
	        	
	        	 players.add(new Human(username1));
	             players.add(new Computer(levelHigh));
	        } 
	        else if (gameType == GameType.humanAndHuman) {
	            players.add(new Human(username1));
	            players.add(new Human(username2));
	        } 
	        else {
	            System.out.println("Error: Please select a valid gameType");
	        }
	 }
	 
	// Method to remove a player to the game
	 
	 public void removePlayers() {
		 
		 players.clear();
		 
	 }
	 
	// Method to list all the points of players of the Game
	    
	    public void printPlayers() {
	        System.out.println("Players");
	        for (Player player : players) {
	            System.out.println("Player points: " + player.getPoints());
	        }
	    
	}
	 





}
 
	
