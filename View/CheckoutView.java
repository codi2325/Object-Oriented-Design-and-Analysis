package View;

public class CheckoutView implements ShowScreenInterface{

	@Override
	public void showScreen(Customer c) {
		
		System.out.println("Here is your order so far: ");
		System.out.println(c.getDeck());
		System.out.println(c.getTrucks());
		System.out.println(c.getWheels());
	}
	
	
}
