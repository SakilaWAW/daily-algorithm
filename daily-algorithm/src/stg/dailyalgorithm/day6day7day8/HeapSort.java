package stg.dailyalgorithm.day6day7day8;

public class HeapSort extends Sort{

	public HeapSort(int[] target_arr) {
		super(target_arr);
	}

	/**
	 * Heap sort:<br/>
	 * There are some important step in heap sort:<br/>
	 * (the start index of the target_arr is 1)<br/>
	 * .ADJUST_NODE(target_arr,unordered_size,root_index):<br/>
	 * When both of node's two children trees are max heap, we can adjust the
	 * node in the steps as follow:<br/>
	 * 1.select the biggest node in three nodes. <br/>
	 * 2.if biggest node is the root node<br/>
	 * or node_index > target_arr's unordered_size/2<br/>
	 * (which means the node is a leaf node):<br/>
	 * the ADJUST_HEAP is over.<br/>
	 * else<br/>
	 * exchange the biggest node to the root node.<br/>
	 * then ADJUST_NODE(target_arr,unordered_size,biggest_index)<br/>
	 * <br/>
	 * .INIT_HEAP(target_arr):<br/>
	 * This function is to initial max heap by the original array.<br/>
	 * It can change a unordered array to a max heap. 1.for index =
	 * unordered_size/2 to 1(reverse order): ADJUST_NODE(target_arr,index)
	 * 
	 * .FETCH_MAXIMUM():<br/>
	 * This function will fetch the root node and adjust the heap.<br/>
	 * 1.exchange root node to the end of the unordered array.unordered_size-1<br/>
	 * 2.ADJUST_NODE(target_arr,unordered_size,1).<br/>
	 * <br/>
	 * The total process of the heap sort is:<br/>
	 * INIT_HEAP(target_arr)->FETCH_MAXIMUM() until the size of unordered array
	 * is 1.
	 */
	@Override
	public void sort() {
		if (m_array == null) {
			printResult(false);
		} else {
			// initial the array to max heap.
			init_heap(m_array);
			int unorder_size = m_array.length;
			while (unorder_size > 1) {
				fetch_maximum(m_array, unorder_size);
				--unorder_size;
			}
			printResult(true);
		}
	}
	
	/**
	 * fetch the maximum and adjust the heap.
	 */
	private void fetch_maximum(int[] target_arr,int unorder_size){
		if(unorder_size <= 1) return;
		exchange(target_arr,1,unorder_size);
		adjust_node(target_arr,unorder_size-1,1);
	}
	
	/**good
	 * initial the array into a max heap.
	 */
	private void init_heap(int[] target_arr){
		for(int index = target_arr.length / 2; index >= 1; --index){
			adjust_node(target_arr,target_arr.length,index);
		}
	}
	
	/**
	 * adjust a node.
	 */
	private void adjust_node(int[] target_arr,int unordered_size,int root_index){
		//left child index & right child index
		int left_index = root_index * 2;
		int right_index =  root_index * 2 + 1;
		//root node value
		int root = target_arr[root_index-1];
		if(root_index > unordered_size / 2){//leaf node
			return;
		}
		//max node index
		int max_index = root_index;
		//left_index must exist
		if(target_arr[left_index-1] > root){
			max_index = left_index;
		}
		//right_index may exist
		if(right_index <= unordered_size 
				&& target_arr[right_index-1] > target_arr[max_index-1]){
			max_index = right_index;
		}
		if(max_index != root_index){//the biggest node is node root
			exchange(target_arr,max_index,root_index);
			adjust_node(target_arr,unordered_size,max_index);
		}else{//root node is max
			return;
		}
	}
	
	/**
	 * exchange two number in the array.
	 * @param target_arr
	 * @param index1
	 * @param index2
	 */
	private void exchange(int[] target_arr,int index1,int index2){
		int temp = target_arr[index1-1];
		target_arr[index1-1] = target_arr[index2-1];
		target_arr[index2-1] = temp;
	}

	@Override
	public String getName() {
		return "Heap sort";
	}

}
