package stg.algorithm.day14;

import java.util.Scanner;

import stg.tools.StringTypeChecker;

public class Test {

	public static void main(String[] args) {
		Scanner scanner;
		while(true){
			scanner = new Scanner(System.in);
			System.out.println("please input the target String:");
			if(scanner.hasNextLine()){
				String target = scanner.nextLine();
				if(!StringTypeChecker.isAllLetters(target)){
					System.out.println("please input the string in required format.");
					continue;
				}else{
					System.out.println(Algorithm.getReverseVowelsString(target));
				}
			}
		}
	}

}
