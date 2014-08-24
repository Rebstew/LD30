package engine;

public abstract class Entity {

	protected int x;
	protected int y;
	protected int maxLifePoints;
	protected int currentLifePoints;
	protected Player owner;

	public Entity(int x, int y, int maxLifePoints, Player owner) {
		this.x = x;
		this.y = y;
		this.maxLifePoints = maxLifePoints;
		this.currentLifePoints=maxLifePoints;
		this.owner = owner;
	}
	
	public void damage(int amount){
		currentLifePoints -= amount;
	}
	
	public void heal(int amount){
		currentLifePoints += amount;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getCurrentLifePoints(){
		return currentLifePoints;
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

	public int getMaxLifePoints() {
		return maxLifePoints;
	}

	public void setMaxLifePoints(int maxLifePoints) {
		this.maxLifePoints = maxLifePoints;
	}

	public void setCurrentLifePoints(int currentLifePoints) {
		this.currentLifePoints = currentLifePoints;
	}

}
