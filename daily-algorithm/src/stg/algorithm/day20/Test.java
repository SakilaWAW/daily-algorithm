package stg.algorithm.day20;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("please input the target string:");
			if(scanner.hasNextLine()){
				String target = scanner.nextLine();
				Algorithm algo = new Algorithm(target);
				System.out.println(algo.atoi());
			}else{
				System.out.println("input the target string please.");
			}
		}
	}

}
