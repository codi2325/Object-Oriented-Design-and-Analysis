package View;

public class Customer {
	
	//private Board boardType;
	private Decks deck;
	private Wheels wheels;
	private Trucks trucks;
	
    public Customer(Decks deck, Wheels wheels, Trucks trucks)
    {
    	this.deck = deck;
    	this.wheels = wheels;
    	this.trucks = trucks; 
    }

//	public Customer(Object deck2, Object wheels2, Object trucks2) {
//		// TODO Auto-generated constructor stub
//	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Decks getDeck() {
		return deck;
	}

	public void setDeck(Decks deck) {
		this.deck = deck;
	}

	public Wheels getWheels() {
		return wheels;
	}

	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
	}

	public Trucks getTrucks() {
		return trucks;
	}

	public void setTrucks(Trucks trucks) {
		this.trucks = trucks;
	}
}
