package View;

import java.util.ArrayList;
import java.util.List;



public class Decks implements ShowScreenInterface{

	private String type;
	private String color;
	private String design;
	private String griptape;

	
	public static ArrayList<Decks> presets = new ArrayList<Decks>();
	
	public void showScreen()
	{
		System.out.println(presets);
		System.out.println("What deck do you want?");
	}
	
	public Decks(String type, String color, String design, String griptape)
	{
		this.type = type;
		this.color = color;
		this.design = design;
		this.griptape = griptape;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getGriptape() {
		return griptape;
	}

	public void setGriptape(String griptape) {
		this.griptape = griptape;
	}
	
	@Override
	public String toString() {
		return "DECK: " +"Brand: " + this.type +"." + " Design: "+ this.design +"." + " Color: " + this.color +"." + " Griptape: " + this.griptape + ".\n";
	}

	@Override
	public void showScreen(Customer c) {
		// TODO Auto-generated method stub
		
	}
	
	
}

/*0
 * 
 * Deck myDeck = new Decks(a,b,c,d)
 * myDeck.getType()*/