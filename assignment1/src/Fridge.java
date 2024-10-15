package assignment1;

// subclass of appliance which implements the remote control interface
public class Fridge extends Appliance implements remoteControl {
	
	
	// data members specific to the fridge
	private boolean isDoorOpen;
	private boolean defrosting;
	
	//constructors
	// set initial values - changed when running the tester
	public Fridge() {
		this(0, false, false, false);
	}
	public Fridge(int MaxWatts, boolean isOn, boolean isDoorOpen, boolean defrosting) {
		super(MaxWatts, isOn);
		this.isDoorOpen = isDoorOpen;
		this.defrosting = defrosting;
	}
	
	//getter
	public boolean getIsDoorOpen() {
		return isDoorOpen;
	}
	
	public boolean getDefrosting() {
		return defrosting;
	}
	
	// setter
	public void setIsDoorOpen(boolean isDoorOpen) {
		this.isDoorOpen = isDoorOpen;
	}
	
	public void setDeFrost(boolean defrosting) {
		this.defrosting = defrosting;
	}
	
	// interface method - no body in the interface
	// may be changed to add messages depending on fridge status
	public void alertUser() {
		System.out.println("There are no new alerts!");
	}
	public void sendStatus() {
		System.out.println("The status of the fridge is good");
	}
	
	// Fridge info
	@Override
	public String toString() {
		return "This is a Fridge! \nWatts: " + getMaxWatts() +
		"\nPower on?: " + getIsOn() +
		"\nDoor Open?: " + getIsDoorOpen() +
		"\nDefrosting?: " + getDefrosting();
	}

}
