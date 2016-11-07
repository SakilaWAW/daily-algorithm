package stg.dailyalgorithm.day6day7day8;

public class QuickSort extends Sort{

	public QuickSort(int[] target_arr) {
		super(target_arr);
	}

	/**
	 * quick sort is the most useful sort in our daily life.
	 * This function is the simple solution in quick sort.
	 * There are lots of improvements.I will search these 
	 * improvements in the near future.
	 */
	@Override
	public void sort() {
		//error check
		if(m_array == null || m_array.length == 0){
			printResult(false);
		}else{
			quickSort(m_array,0,m_array.length-1);
			printResult(true);
		}
	}
	
	/**
	 * recursion function.
	 * three steps:
	 * 	PARTITION:separate target_arr into three parts.(>pivot,<pivot,==pivot)
	 *  QUICKSORT(target_arr,start,i-1):recursion left part.
	 *  QUICKSORT(target_arr,i+1,end):recursion right part.
	 * Basic solution is easy and effective,pretty good. 
	 * @param target_arr
	 * @param start start index
	 * @param end end index
	 */
	private void quickSort(int[] target_arr,int start,int end){
		if(end <= start) return;
		//get the first number in the array as a pivot
		int pivot = target_arr[start];
		//two sentinels
		int i = start;
		int j = start + 1;
		while(j <= end){
			if(target_arr[j] < pivot){
				++i;
				exchange(target_arr, i, j);
			} 
			++j;
		}
		exchange(target_arr,start,i);
		
		//recursion left_part & right_part
		quickSort(target_arr,start,i-1);
		quickSort(target_arr,i+1,end);
	}
	
	/**
	 * exchange two number in the array.
	 * @param target_arr
	 * @param index1
	 * @param index2
	 */
	private void exchange(int[] target_arr,int index1,int index2){
		if(index1 == index2) return; 
		int temp = target_arr[index1];
		target_arr[index1] = target_arr[index2];
		target_arr[index2] = temp;
	}

	@Override
	public String getName() {
		return "Quick sort";
	}

}
