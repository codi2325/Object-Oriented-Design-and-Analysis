package View;

public class Longboard extends Board {
	
	String length = "Long";
	String width = "Wide";
	
	public Longboard(String length, String width,Trucks truck, Wheels wheels, Decks deck)
	{
		super(length,width,truck, wheels, deck);
		
	}
	
	public Longboard()
	{
		
	}
	
	@Override
	public String toString() {
		return "LONGBOARD: " +"Length: " + this.length +"." + " Width: "+ this.width +".\n";
	}
}
