package stg.algorithm.day11;

/**
 * Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).
 * Example 1:
 * 	Input: [3, 2, 1]
 *	Output: 1
 *	Explanation: The third maximum is 1.
 *
 *	Example 2:
 *	Input: [1, 2]
 *	Output: 2
 *	Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * 	
 * 	Example 3:
 * 	Input: [2, 2, 3, 1]
 *	Output: 1
 *	Explanation: Note that the third maximum here means the third maximum distinct number.
 *	Both numbers with value 2 are both considered as second maximum.
 * @author stg
 *
 */
public class Algorithm {
	
	public int thirdMax(int[] nums){
		Integer top1 = null;
		Integer top2 = null;
		Integer top3 = null;
		
		for(int i=0 ; i < nums.length ; ++i){
			Integer num = nums[i];
			if(num.equals(top1) || num.equals(top2) || num.equals(top3)) continue;
			if(top1 == null || num > top1){
				top3 = top2;
				top2 = top1;
				top1 = num;
			}else if(top2 == null || num > top2){
				top3 = top2;
				top2 = num;
			}else if(top3 == null || num > top3){
				top3 = num;
			}
		}
		if(top3 == null) return top1;
		else return top3;
	}
}
