package assignment2;

// we need to access priorityqueue and scanner 
import java.util.PriorityQueue;
import java.util.Scanner;

public class PatientTester {

	public static void main(String[] args) {
		
		// create scanners
		Scanner input = new Scanner(System.in);
		Scanner int_input = new Scanner(System.in);
		
		// this will change when the user selects to quit
		boolean quit = false;
		
		// create the queue
		PriorityQueue<Patient> patientPriorityQueue = new PriorityQueue<>();
		
		while(quit == false) {
			
			// prompts the user for an input
			System.out.print("\nEnter option:\n"
					+ "1 - add patient\n"
					+ "2 - get patient from queue\n"
					+ "0 - quit\n");
		
			String choice = input.nextLine();
		
			if(choice.equals("1")) {
			
				// create a new patient and ask user for details
				Patient p = new Patient();
			
				System.out.print("\nEnter name: ");
				p.setName(input.nextLine());
				System.out.print("Enter age: ");
				p.setAge(int_input.nextInt());
				System.out.print("Enter condition: ");
				p.setCondition(input.nextLine());
				System.out.print("Enter urgency (0 = low, 10 = extremely urgent): ");
				p.setUrgency(int_input.nextInt());
			
				// once details are entered we want to add the patient
				// to the priority queue
				patientPriorityQueue.add(p);
			
			}
			else if(choice.equals("2")) {
			
				// remove the patient at the front of the priorityqueue and tell user the name
				if(!patientPriorityQueue.isEmpty()) {
					System.out.println(patientPriorityQueue.remove() + " has been removed from the queue!");
				}
				// otherwise tell the user that there are no patients to be removed
				else {
					System.out.println("There are currently no patients in the queue!");
				}
			
			}
			else if(choice.equals("0")) {
				
				quit = true;
				System.out.println("\nYou Have Quit!");
			
			}
		}
		
		// close the scanners
		input.close();
		int_input.close();

	}

}
