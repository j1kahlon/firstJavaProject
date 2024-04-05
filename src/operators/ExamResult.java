package operators;

import java.util.Scanner;

public class ExamResult {
	Scanner sc = new Scanner(System.in);
	int studentScore; // Score obtained by the student
	int passingScore = 60; // score required to pass the exam

	public void checkExamResult() {
		System.out.println("Enter student's score");
		int studentScore = sc.nextInt();
		// int passingScore = sc.nextInt();

		if (studentScore >= passingScore) {

			System.out.println("Congratulations! You have passed the exam.");

		} else {
			System.out.println("Sorry, you have not passed the exam. Better luck next time.");
		}
	}

}
