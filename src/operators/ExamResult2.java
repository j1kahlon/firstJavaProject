package operators;

import java.util.Scanner;

public class ExamResult2 {
	Scanner sc = new Scanner(System.in);
	int rollNo;
	int examScore;

	public void checkExamResult2() {

		System.out.println("Please login the Student portal");

		System.out.println("Enter Student's rollno");

		int rollNo = sc.nextInt();
		if (rollNo >= 1 && rollNo <= 60) {

			System.out.println("Enter student's exam score");
		} else {
			System.out.println("Sorry, you are not able to check the exam result");
		}

		int examScore = sc.nextInt();

		if (examScore <= 0 || examScore > 100) {
			System.out.println("Invalid exam score entered. Please enter a score between 0 and 100.");
		}

		else if (examScore >= 60 && examScore <= 100) {
			System.out.println("Congratulations! You have passed the exam.");

		} else {
			System.out.println("Sorry, you have not passed the exam. Better luck next time.");

		}

	}

}