package ifElseAssignment;

import java.util.Scanner;

public class OntarioLicenseAuthority {
	int age;
	String currentLevel;
	Scanner sc = new Scanner(System.in);

	void issueAOntarioDrivingLicense() {
		System.out.println("Enter the Age of the Person \n" + "1.>Age :");
		int age = sc.nextInt();
		if (age <= 15) {
			System.out.println("Licence will not issued to the person because minimum age to get a license is 16");
		}

		if (age >= 16) {
			System.out.println("Eligible to get license");
			System.out.println("Once person pass knowledge and eyes test, person will get class G1 license");
		}
		System.out.println("Enter the Current Licence level():");

		String currentLevel = sc.next();
		if (currentLevel.equals("G1")) {

			System.out.println("License will be issued ,person will get class G2 or G license");
		} else if (currentLevel.equals("G2")) {
			System.out.println("Licence will be issued,Person will eligible to get G licence");
		} else if (currentLevel.equals("G")) {
			System.out.println("Person already have full licence");
		} else {
			System.out.println("Invalid licence");
		}

	}
}
