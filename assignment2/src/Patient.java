package assignment2;

// implement comparable interface
public class Patient implements Comparable<Patient> {
	
	// attributes of each patient
	private String name;
	private int age;
	private String condition;
	private int urgency;
	
	// constructors of Patient
	public Patient(String name, int age, String condition, int urgency) {
		this.name = name;
		this.age = age;
		this.condition = condition;
		this.urgency = urgency;
	}
	public Patient() {
		this("empty" , 0, "empty", 0);
	}
	
	// getters and setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getUrgency() {
		return urgency;
	}

	public void setUrgency(int urgency) {
		this.urgency = urgency;
	}

	// patient to compare to
	public boolean equals(Patient p) {
		if(this == p) return true;
		if(p == null) return false;
		
		return Double.compare(p.age, this.age) == 0 && p.name.equals(this.name);
	}
	
	// urgency indicates the priority of the queue and age is taken into
	// account where urgency is the same 
	public int compareTo(Patient p) {
		if(this.getUrgency() < p.getUrgency()) return 1;
		else if(this.getUrgency() > p.getUrgency()) return -1;
		else if(this.getUrgency() == p.getUrgency() && this.getAge() < p.getAge()) return 1;
		else if(this.getUrgency() == p.getUrgency() && this.getAge() > p.getAge()) return -1;
		else return 0;
	}
	
	// useful to tell user who has been removed from the queue
	@Override
	public String toString() {
		return getName();
	}
	
	

}
