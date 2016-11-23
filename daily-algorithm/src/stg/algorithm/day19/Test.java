package stg.algorithm.day19;

import java.util.Scanner;

import stg.tools.StringTypeChecker;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("input target string:");
			if(scanner.hasNextLine()){
				String target = scanner.nextLine();
				if(StringTypeChecker.isEnglishSentenceWithoutPunctuation(target)){
					System.out.println("good");
				}else{
					System.out.println("please input in required format.");
				}
			}else{
				System.out.println("please input the target string plz.");
			}
		}

	}

}
