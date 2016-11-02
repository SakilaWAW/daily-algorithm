package stg.dailyalgorithm.day5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner;
		String inorder_str = "";
		String postorder_str = "";
		while(true){
			scanner = new Scanner(System.in);
			System.out.println("please input the inorder traverse(upper letter):");
			if(scanner.hasNext("^[A-Z]+$")){//match the upper letter string
				inorder_str = scanner.next("^[A-Z]+$");
			}else{
				System.out.println("input the params in required format plz.");
				continue;
			}
			System.out.println("please input the postorder traverse(upper letter):");
			scanner = new Scanner(System.in);
			if(scanner.hasNext("^[A-Z]+$")){
				postorder_str = scanner.next("^[A-Z]+$");
			}else{
				System.out.println("input the params in required format plz.");
				continue;
			}
			Algorithm algorithm = new Algorithm();
			String result = algorithm.calculate(inorder_str, postorder_str);
			if("".equals(result)){
				System.out.println("The inorder string does not match the postorder"
									+" string,please ensure the input plz.");
				continue;
			}else{
				System.out.println("The preorder traverse is: " + result);
				break;
			}
		}
		scanner.close();
	}

}
