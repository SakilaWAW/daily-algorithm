package stg.algorithm.day15;

import java.util.Scanner;
import java.util.Stack;

import stg.tools.StringTypeChecker;

public class Test {
	
	public static void main(String[] args){
		Scanner scanner;
		while(true){
			scanner = new Scanner(System.in);
			System.out.println("input the target pre-order traversal:(split with ',')");
			if(scanner.hasNextLine()){
				String target = scanner.nextLine();
				if(StringTypeChecker.isBinaryTree(target, ",")){
					System.out.println(Algorithm.verifyIfPreorder(target));
				}else{
					System.out.println("input in required format,plz.");
				}
			}else{
				System.out.println("input in required format,plz.");
			}
		}
	}
	
}
