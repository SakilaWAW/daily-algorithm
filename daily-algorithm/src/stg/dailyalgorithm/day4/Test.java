package stg.dailyalgorithm.day4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int stepNum;
		int step;
		Scanner scanner;
		while (true) {
			scanner = new Scanner(System.in);
			System.out.println("please input the total " 
								 +"number of the step(positive integer):");
			if(scanner.hasNextInt()){
				stepNum = scanner.nextInt();
			}else{
				System.out.println("input the params in required format plz.");
				continue;
			}
			scanner = new Scanner(System.in);
			System.out.println("please input the step " 
					 +"the frog can jump in one time(positive integer):");
			if(scanner.hasNextInt()){
				step = scanner.nextInt();
			}else{
				System.out.println("input the params in required format plz.");
				continue;
			}
			Algorithm algorithm = new Algorithm();
			int result = algorithm.calculate(stepNum, step);
			if(result == -1){
				System.out.println("There are some mistakes in the input params."
						 				+"Please input in required format.");
			}else{
				System.out.println("We have "+ result + " way(s) to reach the top.");
				break;
			}
		}
		scanner.close();
	}

}
