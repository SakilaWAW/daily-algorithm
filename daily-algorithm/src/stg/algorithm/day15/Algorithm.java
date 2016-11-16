package stg.algorithm.day15;

import java.util.Stack;

/**
 * Verify Preorder Serialization of a Binary Tree
 * Difficulty: Medium
 *
 * One way to serialize a binary tree is to use pre-order traversal. When we encounter a non-null node, we record the node's value. If it is a null node, we record using a sentinel value such as #.
 *
 *     _9_
 *    /   \
 *   3     2
 *  / \   / \
 *  4   1  #  6
 * / \ / \   / \
 * # # # #   # #
 * For example, the above binary tree can be serialized to the string "9,3,4,#,#,1,#,#,2,#,6,#,#", where # represents a null node.
 * Given a string of comma separated values, verify whether it is a correct preorder traversal serialization of a binary tree. Find an algorithm without reconstructing the tree.
 *
 * Each comma separated value in the string must be either an integer or a character '#' representing null pointer.
 *
 * You may assume that the input format is always valid, for example it could never contain two consecutive commas such as "1,,3".
 *
 * Example 1:
 * "9,3,4,#,#,1,#,#,2,#,6,#,#"
 * Return true
 *
 * Example 2:
 * "1,#"
 * Return false
 *
 * Example 3:
 * "9,#,#,1"
 * Return false
 * @author stg
 *
 */
public class Algorithm {
	
	/**
	 * use a stack to record the number of child node for every node.
	 * This method only beat 30% of people.
	 * It's not good enough.
	 */
	public static boolean verifyIfPreorder(String target){
		if(target.equals("") || target.equals("#")) return true;
		String[] target_arr = target.trim().split(",");
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < target_arr.length; ++i){
			String thisValue = target_arr[i];
			if(thisValue.equals("#")){
				if(stack.isEmpty()) return false;
				
				increaseTopValue(stack);
				while(stack.lastElement() == 2){
					stack.pop();
					if(stack.isEmpty()){
						if(i == target_arr.length -1) return true;
						else return false;
					}else{
						increaseTopValue(stack);
					}
				}
			}else{
				stack.add(0);
			}
		}
		return false;
	}
	
	private static void increaseTopValue(Stack<Integer> stack){
		stack.push(stack.pop()+1);
	}
}
