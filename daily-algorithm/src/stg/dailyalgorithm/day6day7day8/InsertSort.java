package stg.dailyalgorithm.day6day7day8;

public class InsertSort extends Sort{

	public InsertSort(int[] target_arr) {
		super(target_arr);
	}

	@Override
	public void sort() {
		if(m_array != null){
			insertSort(m_array);
			printResult(true);
		}else{
			printResult(false);
		}
	}
	
	/**
	 * Insert sort:
	 * 	read the number one by one,put each number into the array in order.
	 * It's like drawing poker.
	 * This algorithm has a feature:
	 * 	When the array has been sorted basically in order,it's extremely fast.
	 * @param target_arr
	 */
	private void insertSort(int[] target_arr){
		for(int index =0;index < target_arr.length ; ++index){
			//store the target insert number
			int num = target_arr[index];
			int compare_index = index -1;
			while(compare_index >= 0){
				if(num < target_arr[compare_index]){
					//push [compare_index] to [compare_index+1]
					target_arr[compare_index+1] = target_arr[compare_index];		
				}else{
					//stop push
					break;
				}
				--compare_index;	
			}
			//set the empty index to num
			target_arr[compare_index+1] = num;
		}
	}

	@Override
	public String getName() {
		return "Insert sort";
	}

}
