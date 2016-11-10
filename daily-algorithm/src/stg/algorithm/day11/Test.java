package stg.algorithm.day11;

import java.util.Scanner;

import stg.tools.StringTypeChecker;

public class Test {
	
	public static void main(String[] args) {
		Scanner scanner;
		while(true){
			scanner = new Scanner(System.in);
			System.out.println("please input the target array(separate with ',')");
			if(scanner.hasNextLine()){
				String array = scanner.nextLine();
				if(StringTypeChecker.isIntegerArray(array, ",")){
					Algorithm algorithm = new Algorithm();
					int result = algorithm.thirdMax(parseToIntArray(array, ","));
					System.out.println("The \"third max\" of the array is:" + result);
					break;
				}else{
					System.out.println("input params in required format,plz.");
				}
				
			}
		}
		scanner.close();
	}
	
	private static int[] parseToIntArray(String array_str,String regex){
		String[] str_array = array_str.split(regex);
		int[] result = new int[str_array.length];
		for(int i =0; i <str_array.length ; ++i){
			result[i] = Integer.parseInt(str_array[i]);
		}
		return result;
	}

}
