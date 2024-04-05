package operators;

public class Numbers {
	int num1 = 10;
	int num2 = 15;

	void add() {
		int sum = num1 + num2;
		System.out.println("Sum is " + sum);
	}

	void subtract() {
		int difference = num1 - num2;
		System.out.println("Difference is " + difference);
	}

	void multiply() {
		int product = num1 * num2;
		System.out.println("Product is " + product);
	}

	void division() {
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		System.out.println("Quotient is " + quotient);
		System.out.println("Remainder is " + remainder);
	}

	void divide() {
		double quotient = num1 / num2;
		double remainder = num1 % num2;
		System.out.println("Quotient is " + quotient);
		System.out.println("Remainder is " + remainder);
	}

}
