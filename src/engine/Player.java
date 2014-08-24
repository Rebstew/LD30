package engine;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private int money;
	private PlayerType type;
	private List<ArrayList<Town>> towns;
	
	public Player(int money, PlayerType type) {
		this.money = money;
		this.type = type;
	}
	
	public void addMoney(int money){
		money += money;
	}
	
	public void spendMoney(int money){
		money -= money;
	}
	
	public List<ArrayList<Town>> getTowns(){
		return towns;
	}
	
	public int getNbTowns(){
		int res = 0;
		for(ArrayList<Town> a : towns){
			res += a.size();
		}
		return res;
	}
	
	public PlayerType getType(){
		return type;
	}
	
	public int getMoney(){
		return money;
	}

}
