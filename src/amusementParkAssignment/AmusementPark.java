package amusementParkAssignment;

import java.util.Scanner;

public class AmusementPark {
	double height;
	int maxCapacity = 10;
	int currentCapacity;
	Scanner sc = new Scanner(System.in);

	void isPersonAllowedOnTheRide() {

		{
			int currentCapacity = 0;
			for (int noOfPeople = 1; noOfPeople <= maxCapacity; noOfPeople++) {
				System.out.println("Enter the height of the person " + noOfPeople + " in cm ");
				double height = sc.nextDouble();
				if (height > 90 && height < 200) {
					System.out.println("Person " + noOfPeople + ":  is allowed to get on the ride");
					currentCapacity++;

				} else {
					System.out.println("Person " + noOfPeople
							+ ": doesn't meet the height criteria and is not  allowed  on the ride ");
					noOfPeople--;
					System.out.println(" check again the eligibility of another person ");

				}

			}
			if (currentCapacity == maxCapacity) {
				System.out.println("Ride is Full,No more people allowed to get on the Ride");

			}
		}
	}
}
