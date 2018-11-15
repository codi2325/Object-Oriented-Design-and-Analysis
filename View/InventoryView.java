package View;

import java.util.List;
import java.util.Scanner;

public class InventoryView implements ShowScreenInterface{
	
	
	
	
	public void showScreen(Customer c)
	{
		System.out.println(Decks.presets);
		System.out.println(Trucks.presets);
		System.out.println(Wheels.presets);
		System.out.println("To go back to the previous screen type in 1 and press enter");
		
		Scanner newReader = new Scanner(System.in);
		String input = newReader.nextLine();
		
		switch(input) 
		{
		case "1": 
			HomeScreenView home = new HomeScreenView();
			home.showScreen(c);
			break;
		}

	
}
	
}


