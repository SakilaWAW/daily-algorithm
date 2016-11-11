package stg.algorithm.day12;

import java.util.Scanner;

import stg.tools.StringTypeChecker;

public class Test {

	public static void main(String[] args) {
		Scanner scanner;
		while(true){
			System.out.println("please input version1:");
			scanner = new Scanner(System.in);
			String version1 = "";
			String version2 = "";
			if(scanner.hasNextLine()){
				version1 = scanner.nextLine();
			}
			if(scanner.hasNextLine()){
				version2 = scanner.nextLine();
			}
			if(StringTypeChecker.isIntegerArray(version1, "\\.") 
				&& StringTypeChecker.isIntegerArray(version2, "\\.")){
				System.out.println("The result is:"+
								new Algorithm().compareVersionFunc2(version1, version2));
			}else{
				System.out.println("input params in required format,plz.");
			}
		}
	}
}
