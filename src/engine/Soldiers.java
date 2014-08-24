package engine;

import java.util.Random;

public class Soldiers extends Entity {

	private Entity target;
	
	public Soldiers(int x, int y, int lifePoints, Player owner) {
		super(x, y, 20, owner);
		// TODO Auto-generated constructor stub
	}
	
	public void setTarget(Entity e){
		if(e.getOwner() != this.owner){
			target = e;
		}
	}
	
	public Entity getTarget(){
		return target;
	}
	
	public void move(int x, int y){
		super.setX(x);
		super.setY(y);
	}
	
	public void attack(Entity e){
		Random rand = new Random();
		
		//bonus from -10 to 9 dmg
		int bonus = rand.nextInt(maxLifePoints)-10;
		
		//-5 dmg if e is a soldier in a town
		int malus = (e instanceof Soldiers && ((Soldiers) e).isInTown()?-5:0);
		
		e.damage(this.currentLifePoints+bonus+malus);
		//TODO : -5 dmg if e is in a town and a Soldier
	}
	
	/**
	 * Checks if this Soldier unit is based in a town
	 * @return wether this object is on the same square as a Town
	 */
	public boolean isInTown(){
		if(Game.getInstance().getGameMap().isTown(x, y)){
			return true;
		} else return false;
	}
	
	

}
