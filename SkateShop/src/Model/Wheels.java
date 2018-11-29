package Model;

import java.util.ArrayList;

import View.ShowScreenInterface;

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
		this.size = size;
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
	
	public Wheels clone() throws CloneNotSupportedException
	{
		Wheels wheelCopy = new Wheels(this.type,this.color,this.hardness,this.size);
		return wheelCopy;
	}
	@Override
	public void showScreen(Customer c, State s,Originator origin, CareTaker care) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "\n" + "WHEELS: " + "Type: " + this.type + ". " +"Size: " + this.size +"." + " Color: "+ this.color +"." + " Hardness: " + this.hardness;
	}
	
	
	
}
