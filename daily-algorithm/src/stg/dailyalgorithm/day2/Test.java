package stg.dailyalgorithm.day2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner;
		while (true) {
			scanner = new Scanner(System.in);
			System.out.println("Please input a positive number:");
			if (scanner.hasNextInt()) {
				int num = scanner.nextInt();
				Algorithm algorithm = new Algorithm();
				int steps = algorithm.calculate(num);
				System.out.println("The least step is " + steps);
				break;

			}
			System.out.println("Input the number in the require format plz.");
		}
		scanner.close();

	}

}
