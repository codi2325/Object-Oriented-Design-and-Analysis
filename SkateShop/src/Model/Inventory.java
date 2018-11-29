package Model;

import java.util.ArrayList;

public class Inventory {
	
	
	Decks neverSummer = new Decks("NeverSummer","Red","Phoenix","Standard Grip");
	Decks LandYacht = new Decks("LandYacht","Wood","Wood","Sticky");
	Decks Rayne = new Decks("Rayne","Blue","Logo","Standards");
	
	Wheels spitFire = new Wheels("Spitfire","Large", "Red", "Medium");
	Wheels seismic = new Wheels("Seismic", "Medium", "Orange","Hard");
	
	Trucks solid = new Trucks("IronGrip","Standard",true,"Standard Tightness");
	Trucks gullwing = new Trucks("Gullwing","Wide",true,"Loose");
	

	public Inventory() {
		
		Decks.presets.add(neverSummer);
		Decks.presets.add(LandYacht);
		Decks.presets.add(Rayne);
		Wheels.presets.add(spitFire);
		Wheels.presets.add(seismic);
		Trucks.presets.add(gullwing);
		Trucks.presets.add(solid);
	}
	
	
}
