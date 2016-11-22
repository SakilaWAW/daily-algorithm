package stg.algorithm.day17;

import java.util.Scanner;

import stg.tools.StringTypeChecker;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("input a binary string(start with '1'):");
			if (scanner.hasNextLine()) {
				String target1 = scanner.nextLine();
				if (!StringTypeChecker.isBinaryString(target1)) {
					System.out.println("input the param in required format!");
					continue;
				}
				System.out.println("input another binary string(start with '1'):");
				if (scanner.hasNextLine()) {
					String target2 = scanner.nextLine();
					if (!StringTypeChecker.isBinaryString(target2)) {
						System.out.println("input the param in required format!");
						continue;
					}
					String result = Algorithm.addBinary1(target1, target2);
					System.out.println("Result is: " + result);
				} else {
					System.out.println("please input a param.");
				}
			} else {
				System.out.println("please input a param.");
			}
		}
	}
}