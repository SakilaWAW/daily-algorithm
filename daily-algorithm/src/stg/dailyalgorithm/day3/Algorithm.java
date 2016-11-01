package stg.dailyalgorithm.day3;

/**
 * The question is:
 * There is n balls and m baskets,I want to
 * put the balls into the baskets.
 * The algorithm returns the count of the distribution.
 * ps:empty basket is allowed.
 * @author stg
 *
 */
public class Algorithm {
	
	/**
	 * the entrance of the algorithm.
	 * @param ball_num
	 * @param basket_num
	 * @return the count of the distribution
	 */
	public int calculate(int ball_num,int basket_num){
		int result;
		if(ball_num<=0 || basket_num <=0){
			result = -1;
		}else{
			result = func1(ball_num,basket_num);
		}
		return result;
	}
	
	/**
	 * recursive function:
	 * In every judgment:
	 * WHEN ball_num < basket_num:
	 * 	func1(ball_num,basket_num) = func1(ball_num,ball_num);
	 * WHEN ball_num >= basket_num,there is two distributions:
	 * 	1.Every basket has at least one ball:
	 * 		func1(ball_num,basket_num) = func1(ball_num-basket_num,basket_num);
	 * 	2.There are at least one empty basket.
	 * 		func1(ball_num,basket_num) = func1(ball_num,basket_num-1);
	 * The exits of the function are:
	 * 	1.If ball_num == 0: return 1;
	 * 	2.If basket_num == 1: return 1;
	 * @param ball_num
	 * @param basket_num
	 * @return the count of the distribution
	 */
	private int func1(int ball_num, int basket_num) {
		if (ball_num == 0 || basket_num == 1) {
			return 1;
		}
		if (ball_num < basket_num) {
			return func1(ball_num, ball_num);
		} else {
			return func1(ball_num - basket_num, basket_num)
					+ func1(ball_num, basket_num - 1);
		}
	}
}
