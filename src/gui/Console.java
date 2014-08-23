package gui;

import javax.swing.JTextArea;

public class Console extends JTextArea {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6576024199473267579L;
	
	/**
	 * Instance of the class (one and only)
	 */
	public static Console consoleInstance;
	
	public static Console getInstance(){
		if(consoleInstance == null){
			consoleInstance = new Console();
			
		}
		return consoleInstance;
	}
	
	/**
	 * Creates the console and outputs a bit of text.
	 */
	private Console(){
		this.append("Welcome to Reinforcements Empire !");
		this.append("==================================\n");		
		this.setEditable(false);
	}
	
	/**
	 * Appends str string at the end with new line
	 */
	public void append(String str){
		super.append(str+"\n");
		this.setCaretPosition(this.getText().length());
	}
}