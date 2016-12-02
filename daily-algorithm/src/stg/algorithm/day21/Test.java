package stg.algorithm.day21;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("please input the index(positive integer):");
			if(scanner.hasNextInt()){
				int index = scanner.nextInt();
				String result = Algorithm.countAndSay(index);
				System.out.println("No." + index + " String is:" + result);
			}else{
				System.out.println("please input the param.");
			}
		}
	}

}
