package engine;

public abstract class Entity {

	protected int x;
	protected int y;
	protected int lifePoints;
	protected Player owner;

	public Entity(int x, int y, int lifePoints, Player owner) {
		this.x = x;
		this.y = y;
		this.lifePoints = lifePoints;
		this.owner = owner;
	}
	
	public void damage(int amount){
		lifePoints -= amount;
	}
	
	public void heal(int amount){
		lifePoints += amount;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getLifePoints(){
		return lifePoints;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

}
