package Controller;

import java.util.Scanner;

import Model.Board;
import Model.CareTaker;
import Model.Customer;
import Model.Decks;
import Model.Inventory;
import Model.Longboard;
import Model.Originator;
import Model.State;
import Model.Trucks;
import Model.Wheels;
import View.HomeScreenView;

public class Controller {
	
	public static void main(String [ ] args) throws CloneNotSupportedException 
	{
		Customer newCustomer = new Customer(); 
		Inventory inven = new Inventory();
		HomeScreenView home = new HomeScreenView();
		
		State state = new State(newCustomer);
		Originator origin = new Originator();
		CareTaker care = new CareTaker();
		home.showScreen(newCustomer, state, origin, care);
		
		
	}
	
	public void selectBoard(Customer c, Board b, String name)
	{

		c.setBoard(b);
		c.getBoard().setBoardType(name);;
	}
	public void selectDeck(Customer c)
	{
		boolean valid = false;
		
		Scanner r3 = new Scanner(System.in);
		//String input = r3.nextLine();
		while (!valid)
		{
			System.out.println("Please Enter a valid BRAND name you want!");
			
			String input = r3.nextLine();
		
			for (Decks d: Decks.presets)
			{
				
				
				if (d.getType().equals(input))
				{
					c.getBoard().setDeck(d);
					valid = true;
				}
				
			
			}
			
			
		}
			
				
	}
	
	public void selectTrucks( Customer c)
	{
				///
		boolean valid = false;
		
		Scanner r4 = new Scanner(System.in);
		//String input = r3.nextLine();
		while (!valid)
		{
			System.out.println("Please Enter a valid TYPE name you want!");
			
			String input = r4.nextLine();
		
			for (Trucks t: Trucks.presets)
			{
				
				
				if (t.getType().equals(input))
				{
					c.getBoard().setTruck(t);
					valid = true;
				}
				
			
			}
			
			
		}
			
				
	}
	
	
	public void selectWheels( Customer c)
	{
				///
		boolean valid = false;
		
		Scanner r5 = new Scanner(System.in);
		//String input = r3.nextLine();
		while (!valid)
		{
			System.out.println("Please Enter a valid TYPE name you want!");
			
			String input = r5.nextLine();
		
			for (Wheels w: Wheels.presets)
			{
				
				
				if (w.getType().equals(input))
				{
					c.getBoard().setWheels(w);
					valid = true;
				}
				
			
			}
			
			
		}
			
				
	}
	
	
}
