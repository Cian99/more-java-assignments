package assignment1;

// subclass of appliance
public class VacuumCleaner extends Appliance {
	
	// data members specific to the vacuum
	private int powerLevel;
	
	// constructors
	// set initial values - changed when running the tester
	public VacuumCleaner() {
		this(0, false, 0);
	}
	public VacuumCleaner(int MaxWatts, boolean isOn, int powerLevel) {
		super(MaxWatts, isOn);
		this.powerLevel = powerLevel;
	}
	
	// getter
	public int getPowerLevel() {
		return powerLevel;
	}
	
	// setter
	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}
	
	// Vacuum info
	@Override
	public String toString() {
		return "This is a Vacuum Cleaner! \nWatts: " + getMaxWatts() +
		"\nPower on?: " + getIsOn() +
		"\nPower Level : " + getPowerLevel();
	}

}
