package Model;

public class Board implements Cloneable{

	private String length;
	private String width;
	private Trucks truck;
	private Wheels wheels;
	private Decks deck;
	private String boardType;
	
	
	
	
	public Board(String boardType, String length, String width, Trucks truck, Wheels wheels, Decks deck) {
		
		this.boardType = boardType;
		this.length = length;
		this.width = width;
		this.truck = truck;
		this.wheels = wheels;
		this.deck = deck;
	}


	public Board()
	{
	
	}
	
	public Board clone() throws CloneNotSupportedException
	{
		if(this.truck == null && this.wheels == null && this.deck == null)
		{
			Board board = new Board(this.boardType, this.length, this.width, null, null,null);
			return board;
		}
		Board board = new Board(this.boardType, this.length, this.width, this.truck.clone(), this.wheels.clone(),this.deck.clone());
		return board;
		
	}
	public String getBoardType() 
	{
		return boardType;
	}

	public void setBoardType(String boardType) 
	{
		this.boardType = boardType;
	}
	
	
	
	public Trucks getTruck() {
		return this.truck;
	}


	public void setTruck(Trucks truck) {
		this.truck = truck;
	}


	public Wheels getWheels() {
		return wheels;
	}


	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
	}


	public Decks getDeck() {
		return deck;
	}


	public void setDeck(Decks deck) {
		this.deck = deck;
	}


	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "\n"+ "Boardtype: " +this.boardType + ". Length: " + this.length +"." + " Width: "+ this.width +"." + "Deck: " + this.deck.getType() + ". Trucks: " + this.truck.getType() +"." + " Wheels " + this.wheels.getType() + ".";
	}

	
}
