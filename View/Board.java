package View;

public class Board {
	private String length;
	private String width;
	private Trucks truck;
	private Wheels wheels;
	private Decks deck;
	
	
	
	
	public Board(String length, String width, Trucks truck, Wheels wheels, Decks deck) {
		super();
		this.length = length;
		this.width = width;
		this.truck = truck;
		this.wheels = wheels;
		this.deck = deck;
	}


	public Board()
	{
	
	}
	
	

	public Trucks getTruck() {
		return truck;
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
}
