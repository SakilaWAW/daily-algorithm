package stg.dailyalgorithm.day6;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		Scanner scanner;
		while(true){
			System.out.println("please input the target array(separate with ','):");
			scanner = new Scanner(System.in);
			String array_str = scanner.nextLine().trim();
			String[] array = array_str.split(",");
			//error exclusion
			//simple number is not allowed
			Pattern pattern = Pattern.compile("[0-9]+(,[0-9]+)+");
			if(!pattern.matcher(array_str).matches()){
				System.out.println("input the params in required format plz.");
				continue;
			}else{
				int length = array.length;
				int[] target_array = new int[length];
				for(int i=0 ; i<length ; ++i){
					target_array[i] = Integer.parseInt(array[i]);
				}
				Algorithm algorithm = new Algorithm();
				algorithm.calculate(target_array);
				printArray(target_array);
				break;
			}
		}
		scanner.close();
	}
	
	private static void printArray(int[] array){
		System.out.println("The array in order is:");
		for(int i=0;i<array.length;++i){
			System.out.print(array[i]);
			if(i!=array.length-1){
				System.out.print(",");
			}
		}
	}

}
