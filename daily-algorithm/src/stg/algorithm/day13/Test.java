package stg.algorithm.day13;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner;
		while(true){
			scanner = new Scanner(System.in);
			System.out.println("please input target string & zigzag size:");
			String targetString = "";
			int zigSize = 0;
			if(scanner.hasNextLine()){
				targetString = scanner.nextLine();
			}else{
				System.out.println("Input params in required format,plz.");
				continue;
			}
			if(scanner.hasNextInt()){
				zigSize = scanner.nextInt();
			}else{
				System.out.println("Input params in required format,plz.");
				continue;
			}
			
			String result = Algorithm.convertInSimpleThought(targetString, zigSize);
			System.out.println("The result is:" + result);
		}
	}
}
