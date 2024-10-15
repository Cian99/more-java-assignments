package assignment1;

// this is the tester class 
public class ApplianceTester {

	public static void main(String[] args) {
		
		
		// create toaster and set its info
		// info can also be set with input
		Toaster toaster = new Toaster();
		
		toaster.setMaxWatts(1000);
		toaster.turnOn(true);
		toaster.setNumSlices(4);
		toaster.setMode(1);
		
		// create vacuum and set its info
		VacuumCleaner vacuum = new VacuumCleaner();
		
		vacuum.setMaxWatts(2500);
		vacuum.turnOff(true); // the vacuum is turned off
		vacuum.setPowerLevel(3);
		
		// create fridge and set its info
		Fridge fridge = new Fridge();
		
		fridge.setMaxWatts(250);
		fridge.turnOn(true);
		fridge.setIsDoorOpen(false);
		fridge.setDeFrost(false);
		
		System.out.println("Appliance 1:\n" + toaster.toString());
		System.out.println("\nAppliance 2:\n" + vacuum.toString());
		System.out.println("\nAppliance 3:\n" + fridge.toString());
		
		// also print the interface info for the fridge
		System.out.println("\nFridge info: ");
		fridge.alertUser();
		fridge.sendStatus();

	}

}
