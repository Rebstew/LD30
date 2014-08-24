package gui;

import javax.swing.JFrame;

public class Main extends JFrame{

	private static Main instance;
	
	private Main() {
		super("Reinforcements Empire");
	}
	
	public static Main getInstance(){
		if(instance == null){
			instance = new Main();
		}
		return instance;
	}
	
	public static void main(String[] args){
		instance = new Main();
	}

}
