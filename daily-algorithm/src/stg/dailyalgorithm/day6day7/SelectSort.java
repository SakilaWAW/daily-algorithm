package stg.dailyalgorithm.day6day7;

public class SelectSort extends Sort{

	public SelectSort(int[] target_arr){
		super(target_arr);
	}
		
	@Override
	public void sort() {
		if(m_array != null){
			selectSort(m_array);
			printResult(true);
		}else{
			printResult(false);
		}
	}	
	
	/**
	 * using select sort.
	 * The main thought is to iterate the array again and again.
	 * In each time:
	 * 	Select a smallest(biggest) number and swap it with the end
	 * of the sorted array.
	 * It's direct and a little bit dull.
	 * @param target_arr
	 */
	private void selectSort(int[] target_arr){
		//select sort
		int smallest_index;
		//index point to the end of sorted array.
		for(int index = 0;index < target_arr.length; ++index){
			//[index] is the default smallest number
			//so search from [index+1]
			smallest_index = index;
			for(int i = index+1; i< target_arr.length; ++ i){
				if(target_arr[i] < target_arr[smallest_index]){
					smallest_index = i;
				}
			}
			swap(target_arr,index,smallest_index);
		}	
	}
	
	/**
	 * swap two number in the array.
	 * @param target_arr target array
	 * @param index1 index of one number
	 * @param index2 index of another
	 */
	private void swap(int[] target_arr,int index1,int index2){
		int temp = target_arr[index1];
		target_arr[index1] = target_arr[index2];
		target_arr[index2] = temp;
	}

	@Override
	public String getName() {
		return "Select sort";
	}
}
