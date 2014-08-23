package engine;

public class Soldiers extends Entity {

	private Entity target;
	
	public Soldiers(int x, int y, int lifePoints, Player owner) {
		super(x, y, lifePoints, owner);
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
	
	

}
