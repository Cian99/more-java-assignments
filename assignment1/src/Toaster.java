package assignment1;

//subclass of appliance
public class Toaster extends Appliance {
	
	// data members specific to the toaster
	private int numSlices;
	private int mode;
	
	// constructors
	// set initial values - changed when running the tester
	public Toaster() {
		this(0, false, 0, 0);
	}
	public Toaster(int MaxWatts, boolean isOn, int numSlices, int mode) {
		super(MaxWatts, isOn);
		this.numSlices = numSlices;
		this.mode = mode;
	}
	
	// getters
	public int getNumSlices() {
		return numSlices;
	}
	public int getMode() {
		return mode;
	}
	
	// setters
	public void setNumSlices(int numSlices) {
		this.numSlices = numSlices;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	
	// toaster info in toString
	@Override
	public String toString() {
		return "This is a Toaster! \nWatts: " + getMaxWatts() +
		"\nPower on?: " + getIsOn() +
		"\nSlices: " + getNumSlices() +
		"\nMode: " + getMode();
	}

}
