package Classes;

import java.util.ArrayList;

public class Ship {
	
	private Integer size;
	private Integer value;
	private Boolean isSunk;
	private Boolean isHit;
	private ArrayList<Coordinates> shipCoordinates = new ArrayList<Coordinates>();
	
	//Constructor 
	public Ship(Integer size, Integer value) {
		super();
		this.size = size;
		this.value = value;
		this.isSunk = false;
		this.isHit = false;
		
	}
	
	 // Method to add coordinates to ship
    public void addCoordinates(Integer a, Integer b) {
       
           shipCoordinates.add(new Coordinates(a,b));
        
    }
    
    // Method to remove coordinates to ship
    
    public void removeCoordinates() {
    	shipCoordinates.clear();
    }
	
    
 // Method to list all Coordinates of the ship
    
    public void printCoordinates() {
        System.out.println("Ship Positions:");
        for (Coordinates coord : shipCoordinates) {
            System.out.println("X: " + coord.getX() + ", Y: " + coord.getY());
        }
    
}
    
    
    //Getters and Setters

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Boolean getIsSunk() {
		return isSunk;
	}

	public void setIsSunk(Boolean isSunk) {
		this.isSunk = isSunk;
	}

	public Boolean getIsHit() {
		return isHit;
	}

	public void setIsHit(Boolean isHit) {
		this.isHit = isHit;
	}

	public ArrayList<Coordinates> getShipCoordinates() {
		return shipCoordinates;
	}

	public void setShipCoordinates(ArrayList<Coordinates> shipCoordinates) {
		this.shipCoordinates = shipCoordinates;
	}
	
    
    
	


	

}
