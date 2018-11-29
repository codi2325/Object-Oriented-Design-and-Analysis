package Model;

public class Customer implements Cloneable{
	
	//private Board boardType;
	private Board board;
	
	public Customer()
    {


    }
	
	public Customer(Customer copy)
	{
		this.board = copy.board;
	}
	
	public Customer(Board board)
	{
		this.board = board;
	}
	
	
	public Customer clone() throws CloneNotSupportedException
	{
		if(this.board == null)
		{
			Customer cust = new Customer();
			return cust;
		}
		else {
			Customer cust = new Customer(this.board.clone());
			return cust;
		}
	}
    public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	@Override
	public String toString()
	{
		if(this.board == null)
		{
			System.out.println("Please select a new board and its parts.");
		}
		else {
			return this.board.getBoardType() + this.board.getDeck() + this.board.getTruck() + this.board.getWheels();
		}
		return "----------";
		
	}
	
	

}
