package Model;

public class PennyBoard extends Board{
	
	private String length = "Short";
	private String width = "Short";
	private String boardType;
	private String plasticColor;
	
	public PennyBoard(String boardType, String length, String width,Trucks truck, Wheels wheels, Decks deck, String plasticColor)
	{
		super( boardType, length,width, truck, wheels, deck);
		boardType = "PennyBoard";
		
	}

	public PennyBoard()
	{
		
	}
	
	void setPlasticColor(Decks deck)
	{
		this.plasticColor = deck.getColor();
	}
	
	@Override
	public String toString() {
		if (this.plasticColor == null)
		{
			return "PENNYBOARD: " +"Length: " + this.length +"." + " Width: "+ this.width + ". Plastic Color: Choose a Deck first"  + ".\n";
		}
		else
		{
			return "PENNYBOARD: " +"Length: " + this.length +"." + " Width: "+ this.width + " Plastic Color: " + this.plasticColor + ".\n";
		}
			
		
	}
	
}
