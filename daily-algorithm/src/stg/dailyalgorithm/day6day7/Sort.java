package stg.dailyalgorithm.day6day7;

/**
 * All the sort algorithm must implement ISort to realize the polymorphic.
 * @author stg
 *
 */
public abstract class Sort {
	
	protected int[] m_array = null;
	protected int[] copy_array = null;
	
	/**
	 * The entrance of the sort algorithm,
	 * it will sort the array,and print the information 
	 * of the sort.
	 * @param target_arr
	 */
	public abstract void sort();
	
	/**
	 * get the name of the sort
	 * @return
	 */
	public abstract String getName();
	
	/**
	 * init m_array & copy_array
	 * @param target_arr
	 */
	public Sort(int[] target_arr){
		m_array = target_arr;
		copy_array = copyOf(target_arr);
	}
	
	/**
	 * to record the original array for printing the result.
	 * @param target_arr original array
	 * @return copy of original array
	 */
	private int[] copyOf(int[] target_arr){
		int[] copy = new int[target_arr.length];
		for(int i = 0;i< target_arr.length ; ++i){
			copy[i] = target_arr[i];
		}
		return copy;
	}
	
	/**
	 * print the information of the sort which includes:
	 * original array,sorted array,sort name,isSuccess 
	 * @param isSuccess true:sort success,false:sort fail
	 */
	protected void printResult(boolean isSuccess) {
		System.out.println("====================================================================");
		System.out.println(getName() + ":\n");
		System.out.println("The sort is "+(isSuccess?"successful":"failed")+".");
		
		//print the comparison if success.
		if(isSuccess){
			System.out.print("The original array is:	");
			printArrln(copy_array);
			System.out.print("The sorted array is:	");
			printArrln(m_array);
		}
	}
	
	/**
	 * print a array.
	 */
	private void printArrln(int[] array){
		for(int i=0; i< array.length; ++i){
			System.out.print(array[i]);
			if(i!= array.length-1){
				System.out.print(",");
			}
		}
		System.out.println();
	}

}
