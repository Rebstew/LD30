package engine;

import gui.Console;

import java.util.ArrayList;

public class Game {

	private GameState state;
	private Player player1;
	private Player player2;
	private ArrayList<Town> mapTowns;
	private Map gameMap;
	private static Game instance;
	private Console console;
	
	/**
	 * If player 1 plays first or not
	 */
	private boolean first;
	
	public static Game getInstance(){
		return instance;
	}
	
	/**
	 * Creates a game with randomly placed towns
	 * @param first player 1 plays first or not
	 * @param ai is second player ai or normal player
	 * @param nbTowns how many towns should be randomly generated
	 * @param width the map's width
	 */
	private Game(boolean first, boolean ai, int nbTowns, int width, int height) {
		player1 = new Player(500, PlayerType.NORMAL);
		player2 = new Player(500, (ai ? PlayerType.AI : PlayerType.NORMAL));
		this.first = first;
		
		gameMap = new Map(width, height);
		
		instance = this;
		console = Console.getInstance();
		console.append("A new game has started.\nParams : "+nbTowns+" towns, "+width+"*"+height+" grid");
	}
	
	public GameState getState(){
		return state;
	}
	
	public void tick(){
		player1.addMoney(100*player1.getNbTowns());
		player2.addMoney(100*player2.getNbTowns());
		
		
		
		
		//TODO progression rails
	}

	public Map getGameMap() {
		return gameMap;
	}

}
