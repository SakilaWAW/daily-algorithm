package stg.dailyalgorithm.day6day7day8;

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
				sortInVariousMethod(target_array);
				break;
			}
		}
		scanner.close();
	}
	
	/**
	 * sort the array in various method:
	 * It contains:
	 * 	Merge sort,Select sort,Insert sort,Shell sort
	 * up to date.
	 */
	private static void sortInVariousMethod(int[] target_arr){
		Sort sort;
		sort = new SelectSort(copyOf(target_arr));
		sort.sort();
		sort = new MergeSort(copyOf(target_arr));
		sort.sort();
		sort = new InsertSort(copyOf(target_arr));
		sort.sort();
		sort = new ShellSort(copyOf(target_arr));
		sort.sort();
		sort = new HeapSort(copyOf(target_arr));
		sort.sort();
		sort = new QuickSort(copyOf(target_arr));
		sort.sort();
	}
	
	/**
	 * for I sort the array directly(in the memory),
	 * when I try various sort method,I must use the 
	 * copy of the original array.
	 * @param target_arr original array
	 * @return copy of original array
	 */
	private static int[] copyOf(int[] target_arr){
		int[] copy = new int[target_arr.length];
		for(int i = 0;i< target_arr.length ; ++i){
			copy[i] = target_arr[i];
		}
		return copy;
	}

}
