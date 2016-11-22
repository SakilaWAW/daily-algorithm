package stg.algorithm.day18;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("please input the target string(only \"(){}[]\" included):");
			if(scanner.hasNextLine()){
				String target = scanner.nextLine();
				if(target.matches("[\\(|\\)|\\{|\\}|\\[|\\]]*")){
					String result = Algorithm.isValid(target)?"valid":"not valid";
					System.out.println("The target string is " + result);
				}else{
					System.out.println("input params in required format,plz.");
				}
			}else{
				System.out.println("please input a target string.");
			}
		}
	}
}
