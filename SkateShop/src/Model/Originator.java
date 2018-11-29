package Model;

public class Originator {

	private State state;
	private Customer cust;

	public void setState(State state){
	      this.state = state;
	   }

	   public State getState(){
	      return state;
	   }
	   
	   public Customer getCust(){
		      return cust;
		   }

	   public Memento saveStateToMemento(){
	      return new Memento(state);
	   }

	   public void getStateFromMemento(Memento memento){
	      state = memento.getState();
	   }

	public void setState(Customer copyCust) {
		this.cust = copyCust;
		
	}
	
}

