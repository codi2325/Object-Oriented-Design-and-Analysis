package Model;

import java.util.ArrayList;

public class Inventory {
	
	
	Decks neverSummer = new Decks("NeverSummer","Red","Phoenix","Standard Grip");
	Decks LandYacht = new Decks("LandYacht","Wood","Wood","Sticky");
	Decks Rayne = new Decks("Rayne","Blue","Logo","Standard Grip");
	Decks Deathwish = new Decks("DeathWwish", "Red and White", "Reaper logo", "No Grip");
	Decks SantaCruz = new Decks("Santa Cruz", "Orange and Green","Teenage Mutant Ninja Turtles","Standard grip");
	
	Wheels spitFire = new Wheels("Spitfire","Large", "Red", "Medium");
	Wheels seismic = new Wheels("Seismic", "Medium", "Orange","Hard");
	Wheels Bones = new Wheels("Bones", "Small","White","Soft");
	Wheels Sector9 = new Wheels("Sector9","Medium","Ice blue", "Medium");
	Wheels DGK = new Wheels("DGK", "Large", "Checkerboard","Medium");
	
	Trucks solid = new Trucks("IronGrip","Standard",true,"Standard Tightness");
	Trucks gullwing = new Trucks("Gullwing","Wide",true,"Loose");
	Trucks KruxTrucks = new Trucks("KruxTrucks", "Short", false,"Tight");
	Trucks Tensor = new Trucks("Tensor","Standard",false,"Standard Tightness");
	Trucks Thunder = new Trucks("Thunder","Wide", true,"Loose");
	
	

	public Inventory() {
		
		Decks.presets.add(neverSummer);
		Decks.presets.add(LandYacht);
		Decks.presets.add(Rayne);
		Decks.presets.add(Deathwish);
		Decks.presets.add(SantaCruz);
		Wheels.presets.add(spitFire);
		Wheels.presets.add(seismic);
		Wheels.presets.add(Bones);
		Wheels.presets.add(Sector9);
		Wheels.presets.add(DGK);
		
		Trucks.presets.add(gullwing);
		Trucks.presets.add(solid);
		Trucks.presets.add(KruxTrucks);
		Trucks.presets.add(Tensor);
		Trucks.presets.add(Thunder);
	}
	
	
}
