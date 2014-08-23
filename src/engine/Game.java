package engine;

public class Game {

	private GameState state;
	private Player player1;
	private Player player2;
	
	/**
	 * If player 1 plays first or not
	 */
	private boolean first;
	
	/**
	 * Creates a game with randomly placed towns
	 * @param first player 1 plays first or not
	 * @param ai is second player ai or normal player
	 */
	public Game(boolean first, boolean ai) {
		player1 = new Player(500, PlayerType.NORMAL);
		player2 = new Player(500, (ai ? PlayerType.AI : PlayerType.NORMAL));
	}
	
	public GameState getState(){
		return state;
	}
	
	public void tick(){
		//TODO donner argent
		player1.addMoney(100*player1.getNbTowns());
		player2.addMoney(100*player2.getNbTowns());
		
		//TODO progression unites
		
		//TODO progression rails
	}

}
