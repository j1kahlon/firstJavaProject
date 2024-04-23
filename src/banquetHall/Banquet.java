package banquetHall;

public class Banquet {
	double bookingBaseCost;
	double foodCost;
	double beverages;
	double foodTax;
	double beverageTax;
	double tip;

	public Banquet(double bookingBaseCost, double foodCost, double beverages, double foodTax, double beverageTax,
			double tip) {
		this.bookingBaseCost = bookingBaseCost;
		this.foodCost = foodCost;
		this.beverages = beverages;
		this.foodTax = foodTax;
		this.beverageTax = beverageTax;
		this.tip = tip;
	}

	public double calculateBaseCost(double bookingBaseCost, double foodCost, double beverages, double tip) {

		double totalBaseCost = bookingBaseCost + foodCost + beverages + tip;
		return totalBaseCost;
	}

	public double calculateTax(double bookingBaseCost) {

		double tax = bookingBaseCost * (foodTax / 100) + (beverageTax / 100);
		return tax;
	}

	public double calculateCess(int noOfGuests, double totalBaseCost) {
		double cess = 0;

		if (noOfGuests > 0 && noOfGuests <= 40) {
			cess = totalBaseCost * 0.04;
		} else if (noOfGuests >= 41 && noOfGuests <= 80)

		{
			cess = totalBaseCost * 0.08;
		} else if (noOfGuests >= 81 && noOfGuests <= 150)

		{
			cess = totalBaseCost * 0.10;
		} else if (noOfGuests > 150)

		{
			cess = totalBaseCost * 0.125;
		}
		return cess;
	}

	public double calculateTheTotalCost(double totalBaseCost, double tax, double cess) {
		return totalBaseCost + tax + cess;

	}
}