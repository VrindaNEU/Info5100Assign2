package Classes;

import Classes.Game.GameType;

public class Demo {

	public static void main(String[] args) {
		// Adding Players to Game
		Game demoGame = new Game();
		
		demoGame.addPlayers(GameType.humanAndComputer, "Player1", false, null);
		
		demoGame.printPlayers();
		
		//Adding Ships to Player
		
		Player player1 = new Player();
		
		player1.addShip(2,3);
		
		player1.printShips();
		
		//Adding Ship Position Coordinates to Ship
		
		Ship newShip = new Ship(4,5);
		
		newShip.addCoordinates(24, 44);
		
		newShip.printCoordinates();
		
		
		
		

	}

}
