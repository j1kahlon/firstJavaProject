package pizzaAssignment;

import java.util.Scanner;

public class PizzaShop2 {
	Scanner sc = new Scanner(System.in);

	void calculateFinalBill() {

		int smallPizzaPrice = 15;
		int mediumPizzaPrice = 20;
		int largePizzaPrice = 25;

		int pepperoniSmallPrice = 2;
		int pepperoniMediumLargePrice = 3;
		int extraCheesePrice = 1;

		System.out.println("Choose pizza size: (1) Small, (2) Medium, (3) Large");
		int pizzaSizeChoice = sc.nextInt();

		System.out.println("Do you want pepperoni topping? (1) Yes, (2) No");
		int pepperoniChoice = sc.nextInt();

		System.out.println("Do you want extra cheese? (1) Yes, (2) No");
		int extraCheeseChoice = sc.nextInt();

		// Calculate the final bill
		int finalBill = 0;
		switch (pizzaSizeChoice) {
		case 1:
			finalBill += smallPizzaPrice;
			break;
		case 2:
			finalBill += mediumPizzaPrice;
			break;
		case 3:
			finalBill += largePizzaPrice;
			break;
		default:
			System.out.println("Invalid pizza size choice.");

		}

		if (pepperoniChoice == 1) {
			if (pizzaSizeChoice == 1) {
				finalBill += pepperoniSmallPrice;
			} else {
				finalBill += pepperoniMediumLargePrice;
			}
		}

		if (extraCheeseChoice == 1) {
			finalBill += extraCheesePrice;
		}

		// Display the final bill
		System.out.println("Your final bill is $" + finalBill);
	}
}
