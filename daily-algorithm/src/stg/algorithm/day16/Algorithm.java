package stg.algorithm.day16;

/**
 * The question is: Given n non-negative integers a1, a2, ..., an, where each
 * represents a point at coordinate (i, ai). n vertical lines are drawn such
 * that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines,
 * which together with x-axis forms a container, such that the container
 * contains the most water.
 * 
 * Note: You may not slant the container.
 * 
 * @author stg
 * 
 */
public class Algorithm {

	/**
	 * My first thought,it's easy to think it up:
	 * 	1.choose a line to be one edge.
	 * 	2.iterate the array to find another edge.
	 * It's quite simple,Huh.
	 * But the time complexity is O(n*n).So the algorithm is not advisable.
	 */
	public static int maxArea1(int[] height) {
		if (height.length == 1 || height.length == 0 || height == null)
			return 0;
		int max = 0;
		for (int i = 0; i < height.length; ++i) {
			int area_front_max = 0;
			int area_back_max = 0;
			for (int j = 0; j < i; ++j) {
				if (height[j] >= height[i]) {
					area_front_max = height[i] * (i - j);
					break;
				}
			}
			for (int j = height.length - 1; j > i; --j) {
				if (height[j] >= height[i]) {
					area_back_max = height[i] * (j - i);
					break;
				}
			}
			max = maxOf(max, area_front_max, area_back_max);
		}
		return max;
	}

	private static int maxOf(int value1, int value2, int value3) {
		int max = value1;
		if (value2 > max)
			max = value2;
		if (value3 > max)
			max = value3;
		return max;
	}
	
	/**
	 * This method is much faster than maxArea1(),it eliminate lots of
	 * situations in maxArea1(),the time complexity is only O(n),brilliant.
	 * 
	 * Explanation:
	 * 	We use two pointer to iterate the array,one from left and another from right.
	 * 	h(left) denote the height of left edge,also h(left) denote the height of right edge.
	 * 	if h(left) > h(right):the volume is absolutely become smaller when ++left,because the
	 * 	container will be narrower but the height will <= h(right).
	 * SO,we can eliminate that part of combination.The time complexity will decrease to O(n).
	 */
	public static int maxArea2(int[] height){
		if(height == null || height.length <= 1) return 0;
		int left = 0;
		int right = height.length - 1;
		int max = 0;
		while(left < right){
			max = Math.max(max, Math.min(height[left], height[right])
									* (right - left));
			if(height[left] > height[right]) ++left;
			else --right;
		}
		return max;
	}
}
