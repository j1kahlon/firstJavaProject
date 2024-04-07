package ifElseAssignment;

import java.util.Scanner;

public class CalculateProductDiscount {
	double itemPrice;
	double discountedPrice;// 50% discount on all products
	String promoCode;// addition discount
	double additionalDiscount;
	Scanner price = new Scanner(System.in);

	void calculateFinalDiscountedValue() {
		System.out.println("Enter the Price of the Product is : $");
		double itemPrice = price.nextDouble();

		double discountedPrice = itemPrice * 0.50;
		System.out.println("Price of the product after 50% discount is : $" + discountedPrice);
		System.out.println("Enter PromoCode");
		String promoCode = price.next();
		if (promoCode.equals("PromoCode5")) {
			System.out.println ("Final Discounted Price of Product is: $" +(discountedPrice *= 0.95));

		} else if (promoCode.equals("PromoCode10")) {
			System.out.println("Final Discounted Price of Product is: $" +(discountedPrice *= 0.90));
		} else if (promoCode.equals("PromoCode20")) {
			System.out.println("Final Discounted Price of Product is: $" +(discountedPrice *= 0.80));

		} else if (!promoCode.equals("none")) {
			System.out.println("Invalid PromoCode , No additional discount applied");

		}
		//System.out.println("Final Discounted Price of Product is: $" + discountedPrice);
	}
}
