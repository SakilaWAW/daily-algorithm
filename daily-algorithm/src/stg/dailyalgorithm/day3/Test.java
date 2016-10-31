package stg.dailyalgorithm.day3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner;
		while (true) {
			System.out.println("please input the paras:" +
					"(number of balls,number of baskets.SEPARATE BY ',')");
			scanner = new Scanner(System.in);
			if (scanner.hasNextLine()) {
				String paras = scanner.nextLine();
				String[] parasArr = paras.split(",");
				if (parasArr.length != 2 || paras.contains(".")) {
					System.out.println("input the params in required format plz.");
					continue;
				}else{
					int ball_num = Integer.parseInt(parasArr[0]);
					int basket_num = Integer.parseInt(parasArr[1]);
					Algorithm algorithm = new Algorithm();
					int count = algorithm.calculate(ball_num, basket_num);
					System.out.println("The count of the distribution: "+ count); 
					break;
				}
			}
		}
		scanner.close();
	}

}
