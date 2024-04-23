package banquetHall;

import java.util.Scanner;

public class MainBanquet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base cost :" + "$");
		double bookingBaseCost = sc.nextDouble();
		System.out.println("Enter food cost :" + "$ ");
		double foodCost = sc.nextDouble();
		System.out.println("Enter beverage cost :" + "$");
		double beverages = sc.nextDouble();
		System.out.println("Enter  food tax percentage :" + "%");
		double foodTax = sc.nextDouble();
		System.out.println("Enter  beverage tax percentage :" + "%");
		double beverageTax = sc.nextDouble();
		System.out.println("Enter tip :" + "$");
		double tip = sc.nextDouble();
		System.out.println("Enter number of Guests :");
		int noOFGuests = sc.nextInt();
		if ((bookingBaseCost > 0) && (foodCost > 0) && (beverages > 0)) {
			Banquet banquet = new Banquet(bookingBaseCost, foodCost, beverages, foodTax, beverageTax, tip);

			double totalBasecost = banquet.calculateBaseCost(bookingBaseCost, foodCost, beverages, tip);
			System.out.println("The total base cost is :" + totalBasecost);
			double tax = banquet.calculateTax(bookingBaseCost);
			System.out.println("Tax on base cost is :" + tax);
			double cess = banquet.calculateCess(noOFGuests, totalBasecost);
			System.out.println("Total cess is : " + cess);
			double totalCost = banquet.calculateTheTotalCost(totalBasecost, tax, cess);
			System.out.println("Total cost is : $ " + totalCost);
		} else {
			System.out.println("All values should be greater than 0.please provide valid inputs");
		}
		sc.close();

	}

}