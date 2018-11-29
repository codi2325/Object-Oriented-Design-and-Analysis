package Model;

public class Memento {
	
	private State state;
	
	
	public Memento(State state2){
	      this.state = state2;
	   }

	   public State getState(){
	      return state;
	   }	

}
