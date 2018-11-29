package Model;

public class SkateBoard extends Board{
	
	private String length = "Medium";
	private String width = "Medium";
	private String boardType;
	

	public SkateBoard(String boardType, String length, String width,Trucks truck, Wheels wheels, Decks deck)
	{
		super(boardType, length,width,truck, wheels, deck);
		this.boardType = "Skateboard";
		
	}
	
	public SkateBoard()
	{
		
	}
	
	public String getBoardType() {
		return boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}
	
	@Override
	public String toString() {
		return "SkateBoard: " +"Length: " + this.length +"." + " Width: "+ this.width +".\n";
	}
	
}
