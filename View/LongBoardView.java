package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.Controller;

public class LongBoardView implements ShowScreenInterface {
	
	public void showScreen(Customer c) {
		while(!isValid(c))
		{
			System.out.println("Enter the options number you wish to execute");
			System.out.println("1: Select Deck");
			System.out.println("2: Select Trucks");
			System.out.println("3: Select Wheels");
			System.out.println("4: Browse Longboard Parts");
			
			
			Scanner r1 = new Scanner(System.in);
			
			String input = r1.nextLine();
			
			Controller controller1 = new Controller();
			switch(input) {
			case "1":
				System.out.println(Decks.presets);
				//System.out.println("Please enter the brand name of the board to add it");
				
				//Scanner r2 = new Scanner(System.in);
				//input = r2.nextLine();
				
				controller1.selectDeck(c);
				System.out.println(c.getBoard().getDeck());
				break;
				
			case "2":
				System.out.println(Trucks.presets);
				//System.out.println("Please enter the brand name of the board to add it");
				
				//Scanner r2 = new Scanner(System.in);
				//input = r2.nextLine();
				
				
				controller1.selectTrucks(c);
				System.out.println(c.getBoard().getTruck());
				break;
			case "3":
				System.out.println(Wheels.presets);
				//System.out.println("Please enter the brand name of the board to add it");
				
				//Scanner r2 = new Scanner(System.in);
				//input = r2.nextLine();
				
				
				controller1.selectWheels(c);
				System.out.println(c.getBoard().getWheels());
				break;
			}
			
			
		}		
		
		CheckoutView checkout = new CheckoutView();
		checkout.showScreen(c);
			
			
		}

	private boolean isValid(Customer c) {
		if (c.getBoard().getDeck() != null && c.getBoard().getTruck() != null && c.getBoard().getWheels()!= null)
		{
			return true;
		}
		else {
			return false;
		}
			
		
	
	
	}
		
	}


