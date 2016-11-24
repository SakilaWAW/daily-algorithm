package stg.algorithm.day20;

/**
 * Implement atoi to convert a string to an integer.
 *
 * Hint: Carefully consider all possible input cases. If you want a challenge, 
 * please do not see below and ask yourself what are the possible input cases.
 *
 * Notes: It is intended for this problem to be specified vaguely 
 * (ie, no given input specs). You are responsible to gather all the input 
 * requirements up front.
 * 
 * Requirements for atoi:
 * The function first discards as many whitespace characters as necessary until the 
 * first non-whitespace character is found. Then, starting from this character, takes 
 * an optional initial plus or minus sign followed by as many numerical digits as possible,
 * and interprets them as a numerical value.The string can contain additional characters 
 * after those that form the integral number, which are ignored and have no effect on the 
 * behavior of this function.If the first sequence of non-whitespace characters in str is 
 * not a valid integral number, or if no such sequence exists because either str is empty 
 * or it contains only whitespace characters, no conversion is performed.
 *
 * If no valid conversion could be performed, a zero value is returned. If the correct value 
 * is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648)
 * is returned.
 * @author stg
 *
 */
public class Algorithm {
	
	private String target;
	private int result = 0;
	private int sign = 1;
	private int index = 0;
	
	public Algorithm(String target){
		this.target = target;
	}
	
	public int atoi() {
        if(trimAndJudgeIsNullOrEmpty()) return 0;
        judgeThenInitSignAndIndex();     
	    return calculateFinalValueThenReturn();
    }
	
	private boolean trimAndJudgeIsNullOrEmpty(){
		if (target == null) return true;
        target = target.trim();
		if(target.length() == 0) return true;
		return false;
	}
	
	private void judgeThenInitSignAndIndex(){
		if(target.charAt(0) == '-'){
		    sign = -1;
		    index = 1;
		}else if(target.charAt(0) == '+'){
		    sign = 1;
		    index = 1;
		}
	}
	
	private int calculateFinalValueThenReturn(){
		for(;index < target.length(); ++index){
		    if(!isNumber(target.charAt(index))) break;
		    double nextValue = sign * (result * 10.0 + target.charAt(index) - '0');
		    if(nextValue > Integer.MAX_VALUE) return Integer.MAX_VALUE;
		    if(nextValue < Integer.MIN_VALUE) return Integer.MIN_VALUE;
		    result = result * 10 + target.charAt(index) - '0';
		}
		return result * sign;
	}
	
	private boolean isNumber(char target){
		if(target - '0' > 9 || target < '0') return false;
		return true;
	}
}
