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
	
	private int func1_entrance(int ball_num,int basket_num){
		int count = func1(ball_num,basket_num);
		int permutation = 1;
		for(int i = basket_num;i > 1 ;--i ){
			permutation *= i;
		}
		return count /= permutation;
	}
	
	private int func1(int ball_num,int basket_num){
		if(ball_num == 0 || basket_num == 1){
			return 1;
		}
		int count = 0;
		for(int i =0;i<=ball_num; ++i){
			count += func1(ball_num-i,basket_num-1);
		}
		return count;
	}
}
