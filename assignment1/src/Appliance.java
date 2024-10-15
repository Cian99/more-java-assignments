package assignment1;

// top of hierarchy - don't want instance
abstract class Appliance {
	
	// data members
	private int MaxWatts;
	private boolean isOn;
	
	// constructor
	public Appliance(int MaxWatts, boolean isOn) {
		this.MaxWatts = MaxWatts;
		this.isOn = isOn;
	}
	
	// getters
	public int getMaxWatts() {
		return MaxWatts;
	}
	
	public boolean getIsOn() {
		return isOn;
	}
	
	// setters
	public void setMaxWatts(int MaxWatts) {
		this.MaxWatts = MaxWatts;
	}
	
	// appliance is on
	public void turnOn(boolean isOn) {
		this.isOn = true;
	}
	
	// appliance is NOT on
	public void turnOff(boolean isOn) {
		this.isOn = false;
	}
	
	// add something to the toString - will be changed for each appliance type
	@Override
	public String toString() {
		return "The max watts of this appliance is " + getMaxWatts();
	}

}
