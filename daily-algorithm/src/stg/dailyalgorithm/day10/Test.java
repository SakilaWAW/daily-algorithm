package stg.dailyalgorithm.day10;

import java.util.Scanner;

import stg.tools.StringTypeChecker;

public class Test {

	public static void main(String[] args) {
		Scanner scanner;
		while(true){
			scanner = new Scanner(System.in);
			if(scanner.hasNextLine()){
				String target = scanner.nextLine();
				if(StringTypeChecker.isEnglishSentence(target)){
					System.out.println("The string is " +
							(Algorithm.isPalindrome(target)?"":"not ") + "a palindrome.");
				}else{
					System.out.println("input the sentence in requied format,plz.");
				}
			}
		}
	}

}
