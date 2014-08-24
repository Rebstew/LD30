package engine;

import java.util.ArrayList;

public class Rail extends Entity{
	
	private ArrayList<Entity> connectedTo;

	public Rail(int x, int y) {
		super(x, y, 10, null);
		connectedTo = new ArrayList<Entity>();
	}
	
	public ArrayList<Entity> getConnectedTo(){
		return connectedTo;
	}

}
