package waterTankAssignment;

import java.util.Scanner;

public class WaterTank {
	int tankCapacity = 100;
	int bucketCapacity = 10;
	int currentWaterLevel;

	Scanner sc = new Scanner(System.in);

	/*
	 * There is a water tank of capacity 100 litres. Water is filled into it using
	 * bucket which have capacity of 10 litres. Write a program which fills the tank
	 * to its capacity using these buckets. Also include a mechanism in your program
	 * to stop the tank from over flowing.
	 */

	void waterTankFillingProcess() {

		int currentWaterLevel = 0;

		for (int i = 1; i <= bucketCapacity; i++) {
			System.out.println("Add bucket " + i);
			int buckets = sc.nextInt();
			if (buckets == i) {

				System.out.println("Bucket " + i + " filling...");
			} else if (buckets != 1) {
				i--;
			}
			if (currentWaterLevel < tankCapacity && buckets == i) {
				currentWaterLevel += bucketCapacity;
				System.out.println("Water level  " + currentWaterLevel + " litres");

			}

			if (currentWaterLevel == tankCapacity) {

				System.out.println(
						"Stop water filling ,WaterTank will be overflow,the current level of water in tank is :"
								+ currentWaterLevel + " litres ");
				break;
			}

		}
	}

}
