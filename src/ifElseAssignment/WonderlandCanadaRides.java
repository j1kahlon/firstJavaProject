package ifElseAssignment;

import java.util.Scanner;

public class WonderlandCanadaRides {
	int height;
	int weight;

	Scanner sc = new Scanner(System.in);

	public void ridesAllowed() {
		System.out.println("Welcome to Canada's Wonderland");

		System.out.println("Choose passes and tickets : (1) Season Pass, (2) Daily Tickets, (3)Group Tickets");
		sc.nextInt();

		System.out.println("Choose your ride according to your height and weight ");

		System.out.println("Enter the height of Person");
		int height = sc.nextInt();

		System.out.println("Enter the weight of the Person");
		int weight = sc.nextInt();

		if (height >= 48 && weight >= 110 && weight <= 300) {

			System.out.println("Person Allowed to take three rides :" + "\n 1.)BacklotStuntCoaster\n"
					+ " 2.)SlingShot\n" + " 3.)SwingoftheCentury\n");

			System.out.println("Select your Ride");
			String selectRides = sc.next();

			System.out.println("Enjoy your ride  :" + selectRides);

		} else {
			System.out.println("Ohh!Person does not meet the height or weight criteria and is not allowed on the ride");

			System.out.println("Sorry,you can Choose another ride according to your height and weight");
		}
	}
}
