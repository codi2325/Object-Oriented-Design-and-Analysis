package View;
import java.util.Scanner;

public class HomeScreenView implements ShowScreenInterface {

	public void showScreen(Customer c)
	{
		Decks neverSummer = new Decks("NeverSummer","Red","Phoenix","Standard Grip");
		Decks LandYacht = new Decks("LandYacht","Wood","Wood","Sticky");
		Wheels spitFire = new Wheels("Spitfire","Large", "Red", "Medium");
		Trucks solid = new Trucks("IronGrip","Standard",true,"Standard Tightness");
		
		Decks.presets.add(neverSummer);
		Decks.presets.add(LandYacht);
		Wheels.presets.add(spitFire);
		Trucks.presets.add(solid);
		
		
		
		
		System.out.println("Enter the options number you wish to execute");
		System.out.println("1: Select Board");
		System.out.println("2: Browse Iventory");
		System.out.println("3: Exit");
		
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		
		//reader.close();
		switch(input) {
		case "1": 
			SelectBoardScreen obj = new SelectBoardScreen();
			obj.showScreen(c);
			break;
		case "2": 
			InventoryView inven = new InventoryView();
			inven.showScreen(c);
			
		}
	}
	public static void main(String [ ] args) 
	{
		Customer newCustomer = new Customer(); 
		
		HomeScreenView home = new HomeScreenView();
		home.showScreen(newCustomer);
		
		
	}
			
			
			
	
	
	
	

}
