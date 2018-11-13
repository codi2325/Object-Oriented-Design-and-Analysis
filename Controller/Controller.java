package Controller;

import java.util.Scanner;

import View.Customer;
import View.Decks;
import View.Trucks;
import View.Wheels;

public class Controller {
	
	
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
					c.setDeck(d);
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
					c.setTrucks(t);
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
					c.setWheels(w);
					valid = true;
				}
				
			
			}
			
			
		}
			
				
	}
//	public void selectWheels( Customer c)
//	{
//				///
//		
//		for (Wheels w: Wheels.presets)
//		{
//			if (w.getType().equals(input))
//				c.setWheels(w);
//		}
//			
//				
//	}
//	
	
	
}
