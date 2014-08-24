package engine;

import java.util.ArrayList;

public class Map {

	private Square[][] grid;
	
	public Map(int width, int height) {
		grid = new Square[width][height];
	}
	
	public Square[][] getGrid(){
		return grid;
	}
	
	/**
	 * Add an entity on the square
	 * @param x
	 * @param y
	 * @param e
	 */
	public void addAt(int x, int y, Entity e){
		grid[x][y].addEntity(e);
	}
	
	public boolean isTown(int x, int y){
		boolean result = false;
		ArrayList<Entity> entities = grid[x][y].getEntitiesOnSquare();
		
		for(Entity e : entities){
			if(e instanceof Town){
				return true;
			}
		}
		
		return result;
	}

}
