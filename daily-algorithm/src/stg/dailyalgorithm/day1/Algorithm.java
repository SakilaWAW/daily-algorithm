package stg.dailyalgorithm.day1;

/**
 * This algorithm is about to calculate the sum of a arithmetic progression
 * without:"for","while","if","else","switch","case" and any else control
 * statement.
 * 
 * @author stg
 * 
 */
public class Algorithm {
	/**
	 * The entrance of the algorithm
	 * @param start start number
	 * @param step step
	 * @param length length
	 * @return sum
	 */
	public String calculate(int start,int step,int length){
		int result1 = func1(start,step,length);
		int result2 = func2(start,step,length);
		
		String result = "";
		if(result1 == result2){
			result = "Ok,sum = " + result1;
		}else{
			result = "Oop,there is something wrong";
		}
		return result;
	}
	
	/**
	 * use the formula of arithmetic progression :P
	 * @return sum
	 */
	private int func1(int start,int step,int length){
		int end = start + (length-1) * step;
		int result = (start + end) * length / 2;
		return result;
	}
	
	/**
	 * use function recursion
	 * @return sum
	 */
	private int func2(int start,int step,int length){
		if(length==1) return start;
		return start + func2(start + step,step,length-1);
	}
}