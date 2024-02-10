package Classes;

import java.util.ArrayList;

public class Player {
	
	private ArrayList<Ship> ships = new ArrayList<Ship>();
	private ArrayList<Torpedo> torpedoes =  new ArrayList<Torpedo>();
	private Integer torpedoesRemaining;
	private Integer points = 0;
	
	//Constructor
	public Player(ArrayList<Ship> ships, ArrayList<Torpedo> torpedoes, Integer torpedoesRemaining, Integer points) {
		super();
		this.ships = ships;
		this.torpedoes = torpedoes;
		this.torpedoesRemaining = torpedoesRemaining;
		this.points = points;
	}

	public Player() {
		super();
	}
	
	 // Method to add ships to player
    public void addShip(int size, int value) {
        if (ships.size() < 6) {
            ships.add(new Ship(size, value));
        } else {
            System.out.println("Error: Player has reached the maximum number of ships to add");
        }
    }
    
    // Method to remove ships from player
    
    public void addShip() {
    	ships.clear();
    }
    
    // Method to add torpedos to player
    
    public void addTorpedoes(Coordinates coordinates) {
        if (torpedoes.size() < 45) {
        	torpedoes.add(new Torpedo(coordinates));
        } else {
            System.out.println("Game Over");
        }
    }
    
  // Method to remove torpedos from player
    
    public void removeTorpedos() {
    	torpedoes.clear();
    }
    
    
    
// Method to list all ships of the Player
    
    public void printShips() {
        System.out.println("Ships");
        for (Ship ship : ships) {
            System.out.println("value: " + ship.getValue() + ", size: " + ship.getSize());
        }
    
}
    //Getters And Setters

	public ArrayList<Ship> getShips() {
		return ships;
	}

	public void setShips(ArrayList<Ship> ships) {
		this.ships = ships;
	}

	public ArrayList<Torpedo> getTorpedoes() {
		return torpedoes;
	}

	public void setTorpedoes(ArrayList<Torpedo> torpedoes) {
		this.torpedoes = torpedoes;
	}

	public Integer getTorpedoesRemaining() {
		return torpedoesRemaining;
	}

	public void setTorpedoesRemaining(Integer torpedoesRemaining) {
		this.torpedoesRemaining = torpedoesRemaining;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}
	
    
   
    


}
