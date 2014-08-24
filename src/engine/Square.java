package engine;

import java.util.ArrayList;

public class Square {

	private ArrayList<Entity> entitiesOnSquare;
	
	public Square() {
		entitiesOnSquare = new ArrayList<Entity>();
	}

	public ArrayList<Entity> getEntitiesOnSquare() {
		return entitiesOnSquare;
	}
	
	public void addEntity(Entity e){
		entitiesOnSquare.add(e);
	}
	
	public void removeEntity(Entity e){
		if(entitiesOnSquare.contains(e)){
			entitiesOnSquare.remove(e);
		}
	}
	
	

}
