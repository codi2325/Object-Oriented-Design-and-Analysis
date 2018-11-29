package Model;

public class Longboard extends Board {
	
	private String length = "Long";
	private String width = "Wide";
	private String boardType;
	private String dropthrough; 
	
	public Longboard(String boardType, String length, String width,Trucks truck, Wheels wheels, Decks deck, String dropthrough)
	{
		super( boardType,length,width, truck, wheels, deck);
		this.dropthrough = dropthrough; 
		
	}

	public Longboard()
	{
		
	}
	
	
	
	@Override
	public String toString() {
		return  "\n"+"LONGBOARD: " +"Length: " + this.length +"." + " Width: "+ this.width + ".";
	}
}
