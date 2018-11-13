package View;

import java.util.Scanner;

public class SelectBoardScreen implements ShowScreenInterface {

	public void showScreen(Customer c) {
		System.out.println("Enter the options number you wish to execute");
		System.out.println("1: LongBoard");
		System.out.println("2: SkateBoard");
		System.out.println("3: PennyBoard");
		
		String input = "0";
		
		Scanner r1 = new Scanner(System.in);
		
		input = r1.nextLine();
		
		//reader.close();
		switch(input) {
		case "1":
			LongBoardView obj = new LongBoardView();
			obj.showScreen(c);
			
			//
		
		}
		
	}

	
}
