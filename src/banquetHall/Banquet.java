package banquetHall;

public class Banquet {
	double bookingBaseCost;
	double foodCost;
	double beverages;
	double foodTax;
	double beverageTax;
	double totalBaseCost;
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

		return totalBaseCost = bookingBaseCost + foodCost + beverages + tip;

	}

	public double calculateTax(double bookingBaseCost) {

		return bookingBaseCost * (foodTax / 100) + (beverageTax / 100);
	}

	public double calculateCess(double noOfGuests, double totalBaseCost) {
		double cess = 0;

		if (noOfGuests <= 40) {
			cess = totalBaseCost * 0.04;
		} else if (noOfGuests <= 80)

		{
			cess = totalBaseCost * 0.08;
		} else if (noOfGuests <= 150)

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