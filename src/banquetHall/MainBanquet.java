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
		double noOFGuests = sc.nextDouble();
		Banquet banquet = new Banquet(bookingBaseCost, foodCost, beverages, foodTax, beverageTax, tip);
		double totalBasecost = banquet.calculateBaseCost(bookingBaseCost, foodCost, beverages, tip);
		double tax = banquet.calculateTax(bookingBaseCost);
		double cess = banquet.calculateCess(noOFGuests, totalBasecost);
		double totalCost = banquet.calculateTheTotalCost(totalBasecost, tax, cess);
		System.out.println("Total cost: $ " + totalCost);
		sc.close();

	}

}