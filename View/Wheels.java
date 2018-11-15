package View;

import java.util.ArrayList;

public class Wheels implements ShowScreenInterface{

	public static ArrayList<Wheels> presets = new ArrayList<Wheels>();
	
	private String type;
	private String size;
	private String color;
	private String hardness;
	
	public Wheels(String type, String color, String hardness, String size) {
		this.type = type;
		this.color = color;
		this.hardness = hardness;
		this.size = size;
		
	}
	
	public String getType() {
		return type;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getHardness() {
		return hardness;
	}
	public void setHardness(String hardness) {
		hardness = hardness;
	}
	public void setType() {
		this.type = type;
	}
	@Override
	public void showScreen(Customer c) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "WHEELS: " + "Type: " + this.type + ". " +"Size: " + this.size +"." + " Color: "+ this.color +"." + " Hardness: " + this.hardness +".\n";
	}
	
	
	
}
