package stg.dailyalgorithm.day9;

/**
 * The question is:
 * Input:a single linked list,
 * 		 a number k
 * Output:the value of No.k node in reverse order.
 * 		  (the last node is No.0 node in reverse order)
 * @author stg
 *
 */
public class Algorithm {
	
	private boolean isSuccess = false;
	/**
	 * entrance of the algorithm
	 * @param head head node of the list
	 */
	public boolean calculate(Node head,int target_index){
		//error check and output result
		if(head != null){
			pushForResult(head, target_index);
			if(!isSuccess){
				System.out.println("the params are unreasonable,please change.");
				return false;
			}else{
				return true;
			}
		}else{
			System.out.println("please input values.");
			return false;
		}
	}
	
	/**
	 * use recursion.It's probably not effective but interesting~
	 * @param head head of the list
	 * @param target_index target index(reverse)
	 * @return the reverse index
	 */
	private int pushForResult(Node node,int target_index){
		if(node != null){
			//last node's reverse_index == 0
			int reverse_index = pushForResult(node.next(), target_index);
			if(reverse_index == target_index){
				System.out.println("the value of target node is:" + node.getValue());
				isSuccess = true;
			}
			return reverse_index + 1;
		}else{
			return -1;
		}
	}
}
