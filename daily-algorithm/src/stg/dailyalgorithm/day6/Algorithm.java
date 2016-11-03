package stg.dailyalgorithm.day6;

public class Algorithm {
	
	/**
	 * entrance of the algorithm
	 * @param target_array
	 * @return array in order
	 */
	public int[] calculate(int[] target_array){
		int[] result = null;
		if(target_array!=null){
			result = func1(target_array);
		}
		return result;
	}
	
	
	/**
	 * using merge sort.It's a basic function in sort.
	 * @param target_array
	 * @return array in order
	 */
	private int[] func1(int[] target_array){
		merge_sort(target_array,0,target_array.length-1);
		return target_array;
	}
	
	/**
	 * sort & merge the array from start to end.
	 * @param target_array
	 * @param start start index to sort
	 * @param end end index to sort
	 */
	private void merge_sort(int[] target_array,int start,int end){
		//export
		if(start == end) return;
		
		//middle index of the array
		int middle_index = (start + end) / 2;
		
		//sort before part & sort after part
		merge_sort(target_array,start,middle_index);
		merge_sort(target_array,middle_index+1,end);
		
		//then merge two part
		seekandsort(target_array,start,middle_index,middle_index+1,end);	
	}
	
	/**
	 * get an big array in order from two small array in order.
	 * start1~end1 is array1,start2~end2 is array2.
	 * This function is to merge array1 & array2 into a sorted array.
	 * @param target_array
	 * @param start1
	 * @param end1
	 * @param start2
	 * @param end2
	 */
	private void seekandsort(int[] target_array,int start1,int end1,int start2,int end2){
		int[] result = new int[end2-start1+1];
		//record the start index
		int start_index = start1;
		int index_result = 0;
		while(index_result < result.length){	
			if(start1 > end1){//array1 runs out
				result[index_result] = target_array[start2++];
			}else if(start2 > end2){//array2 runs out but array1 not
				result[index_result] = target_array[start1++];
			}else{//neither array1 nor array2 runs out
				if(target_array[start1] < target_array[start2]){//[array1] is smaller
					result[index_result] = target_array[start1++];
				}else{//[array2] is smaller
					result[index_result] = target_array[start2++];
				}
			}
			++index_result;
		}
		
		//copy the merge result into the target_array 
		for(int i=0;i<result.length;++i){
			target_array[start_index+i] = result[i];
		}
	}
}
