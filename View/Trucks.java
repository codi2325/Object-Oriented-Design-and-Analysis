package View;

import java.util.ArrayList;

public class Trucks implements ShowScreenInterface{

	private String type;
	private String width;
	private boolean kingpin; 
	private String tightness;
	
	public static ArrayList<Trucks> presets = new ArrayList<Trucks>();
	
	public Trucks(String type, String width, boolean kingpin, String tightness) {
		this.type = type;
		this.width = width; 
		this.kingpin = kingpin;
		this.tightness = tightness;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public boolean isKingpin() {
		return kingpin;
	}

	public void setKingpin(boolean kingpin) {
		this.kingpin = kingpin;
	}

	public String getTightness() {
		return tightness;
	}

	public void setTightness(String tightness) {
		this.tightness = tightness;
	}

	@Override
	public void showScreen(Customer c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "TRUCKS: " +"Type: " + this.type +"." + " Width: "+ this.width +"." + " Kingpin: " + this.kingpin +"." + " Tightness: " + this.tightness + ".\n";
	}

	public Object getType() {
		return type;
		
	}

}
