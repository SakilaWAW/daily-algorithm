package stg.algorithm.day16;

import java.util.Scanner;

import stg.tools.StringTypeChecker;

public class Test {

	public static void main(String[] args) {
		Scanner scanner;
		while(true){
			scanner = new Scanner(System.in);
			System.out.println("input the target array(split with comma):");
			if(scanner.hasNextLine()){
				String array_str = scanner.nextLine();
				if(StringTypeChecker.isNonNagativeIntegerArray(array_str,",")){
					int[] target = parseStringToArray(array_str, ",");
					System.out.println("The max area is:" + Algorithm.maxArea1(target));
				}else{
					System.out.println("please input the param in required format.");
				}
			}else{
				System.out.println("please input the param.");
			}
		}
	}
	
	private static int[] parseStringToArray(String target,String regex){
		String[] target_strArr = target.split(regex);
		int[] result = new int[target_strArr.length];
		
		for(int i = 0; i < target_strArr.length; ++i){
			result[i] = Integer.parseInt(target_strArr[i]);
		}
		return result;
	}
}
