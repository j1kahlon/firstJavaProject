package pizzaAssignment;

import java.util.Scanner;

    /*Write a program to prepare the bill for a pizza shop.
          Assume an order and work out the final bill.
       Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
         For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
         Extra cheese for any size pizza: + $1
         For eg: If the Pizza is medium, pepperoni with extra cheese the program should calculate the final bill as 20+3+1 = $24 and print as
          “Your final bill is $24”*/
public class PizzaShop {
	int smallPizzaPrice = 15;
	int mediumPizzaPrice = 20;
	int largePizzaPrice = 25;
	int extraCheesePrice = 1;
	int pepperoniForSmallPizzaPrice = 2;
	int pepperoniForMediumLargePizzaPrice = 3;

	Scanner sc = new Scanner(System.in);

	void calculateTheFinalBill() {
		System.out.println("Select the size of the Pizza");

		System.out.println("1). Small pizza ,  2.) Medium pizza ,  3.) Large pizza");
		int pizzaSize = sc.nextInt();
		System.out.println("Do you want pepperoni?  1.)Yes , 2).No ");
		int pepperoni = sc.nextInt();
		System.out.println("Do you want Extra cheese?  1).Yes ,  2.) No");
		int extraCheese = sc.nextInt();
		int finalBill = 0;
		switch (pizzaSize) {
		case 1:
			finalBill += smallPizzaPrice;
			if (pepperoni == 1) {
				finalBill += pepperoniForSmallPizzaPrice;
			} else {
				pepperoniForSmallPizzaPrice--;
				if (extraCheese == 1) {
					finalBill += extraCheesePrice;
				} else {

					extraCheesePrice--;
				}
			}
			System.out.println("Your final bill is : $" + finalBill);
			break;
		case 2:
			finalBill += mediumPizzaPrice;
			if (pepperoni == 1) {
				finalBill += pepperoniForMediumLargePizzaPrice;
			} else {
				pepperoniForMediumLargePizzaPrice--;
				if (extraCheese == 1) {
					finalBill += extraCheesePrice;
				} else {
					extraCheesePrice--;
					System.out.println("Your final bill is : $" + finalBill);
				}
			}

			break;
		case 3:
			finalBill += largePizzaPrice;
			if (pepperoni == 1) {
				finalBill += pepperoniForMediumLargePizzaPrice;
			} else {
				pepperoniForMediumLargePizzaPrice--;
				if (extraCheese == 1) {
					finalBill += extraCheesePrice;
					System.out.println("Your final bill is : $" + finalBill);
				} else {
					extraCheesePrice--;
					System.out.println("Your final bill is : $" + finalBill);
				}
			}

			break;
		default:
			System.out.println("Invalid size of Pizza");
		}
	}
}
