package Model;

public class State {

	private Customer cust;

	
	
	public State(Customer cust)
	{
		this.cust = cust;
		
	}
	
	public State(State copy)
	{
		this.cust = copy.cust;
	}
	
	public Customer getCustomer()
	{
		return this.cust;
	}
	
	public void setState(Customer cust)
	{
		this.cust = cust;
	}
	
	@Override
	public String toString() 
	{
		return cust.getBoard().getBoardType() + cust.getBoard().getDeck() + cust.getBoard().getTruck() + cust.getBoard().getWheels();
	}
	
}
