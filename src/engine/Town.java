package engine;

import java.util.ArrayList;

public class Town extends Entity{

	/**
	 * Connected components
	 */
	private ArrayList<Town> connectedTo;
	
	public Town(int x, int y, Player owner) {
		super(x, y, 100, owner);
	}
	
	/**
	 * We connect all towns in this connectedTo to the towns in the bigger 
	 * connectedTo, either this one or t's one
	 * @param t the town to connect to
	 */
	public void connectTo(Town t){
		ArrayList<Town> otherGraph = t.getConnectedTo();
		
		if(otherGraph.size() > connectedTo.size()){
			for(Town t2 : connectedTo){
				otherGraph.add(t2);
				t2.setConnectedTo(otherGraph);
			}
		} else {
			for(Town t3 : otherGraph){
				connectedTo.add(t3);
				t3.setConnectedTo(connectedTo);
			}		
		}
	}
	
	public ArrayList<Town> getConnectedTo(){
		return connectedTo;
	}
	
	public void setConnectedTo(ArrayList<Town> graph){
		this.connectedTo = graph;
	}
}
