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
	 * entrance1 of the algorithm
	 * @param head head node of the list
	 */
	public boolean calculate1(Node head,int target_index){
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
	 * entrance2 of the algorithm.
	 * This is a pretty elaborate method:
	 * The algorithm uses two pointer,tandem iterate the list
	 * in the same speed,the distance of them is k.
	 * @param head head node of the list
	 */
	public boolean calculate2(Node head,int target_index){
		//error check and output result
		if(head != null){
			boolean flag = findNodeThenPrint(head, target_index);
			if(flag){
				return true;
			}else{
				System.out.println("the params are unreasonable,please try again.");
				return false;
			}
		}else{
			System.out.println("please input values.");
			return false;
		}
	}
	
	/**
	 * the best method.
	 * @param head head node of the list 
	 * @param target_index 
	 * @return true:print success,false:failed
	 */
	private boolean findNodeThenPrint(Node head,int target_index){
		Node before = head;
		Node after = head;
		//before is target_index steps faster than after
		for(int i=0;i<target_index;++i){
			if(before.next() == null){
				return false;
			}else{
				before = before.next();
			}
		}
		
		//push before to the end
		while(before.next()!=null){
			before = before.next();
			after = after.next();
		}
		
		System.out.println("the target node's value is:" + after.getValue());
		return true;
		
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
			return 0;
		}
	}
}
