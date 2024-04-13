package userAuthenticationAssignment;

import java.util.Scanner;

public class UserAuthentication {
	String userId = "pivotAdmin";
	String userPassword = "Admin123";
	int maxAttempts = 3;
	int currentAttempts = 0;
	Scanner sc = new Scanner(System.in);

	void verifyUserAbleToLogin() {

		for (int i = 1; i <= maxAttempts; i++) {
			System.out.println("Enter Username :");
			String userName = sc.next();
			System.out.println("Enter Password :");
			String password = sc.next();

			if ((userName.equals(userId)) && (password.equals(userPassword))) {

				System.out.println("You are logged in the appication");

				break;

			}

			else {
				System.out.println("Incorrect User id or Password.Try again");
				currentAttempts++;
				//continue;
			}
		}
		if (currentAttempts == maxAttempts) {
			System.out.println("Account Locked");

		}
	}

}
