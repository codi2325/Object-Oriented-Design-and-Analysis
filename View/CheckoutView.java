package View;

public class CheckoutView implements ShowScreenInterface{

	@Override
	public void showScreen(Customer c) {
		
		System.out.println("Here is your order so far: ");
		System.out.println(c.getBoard());
		System.out.println(c.getBoard().getDeck());
		System.out.println(c.getBoard().getTruck());
		System.out.println(c.getBoard().getWheels());
		
		System.out.println("Would you like to checkout?");
	}
	
	
}
