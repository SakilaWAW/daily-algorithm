package stg.algorithm.day17;

/**
 * The question is:
 * 	Given two binary strings, return their sum (also a binary string).
 * 	For example:
 * 	a = "11"
 * 	b = "1"
 * 	Return "100".
 * @author stg
 *
 */
public class Algorithm {
	
	/**
	 * This method simulate the process of decimal addition.
	 * But it not efficient.noob.
	 * I think the reason of low efficiency is the large quantity of parse operation.
	 * It's surprising that when I change
	 * 	num1 = Integer.parseInt(a.charAt(index1--) + "");
	 * 	TO
	 * 	num1 = a.charAt(index1--) - '0'
	 * The time reduce to a half!It's a useful trick.
	 */
	public static String addBinary1(String a,String b){
		int index1 = a.length() - 1;
		int index2 = b.length() - 1;
		int spare = 0;
		String result = "";
		while(index1 >= 0 || index2 >= 0 || spare > 0){
			int num1 = 0,num2 = 0;
			if(index1 >= 0) num1 = a.charAt(index1--) - '0';
			else if(spare == 0){
				result = b.substring(0,index2 + 1) + result;
				break;
			}
			
			if(index2 >= 0) num2 = b.charAt(index2--) - '0';
			else if(spare == 0){
				result = a.substring(0,index1 + 2) + result;
				break;
			}
			int sum = num1 + num2 + spare;
			int value = sum % 2;
			spare = sum / 2;
			result = String.valueOf(value) + result;
		}
		return result;
	}
	
	/**
	 * This method uses the built-in function in Java.It's brief but it has 
	 * a limitation on the length of a & b.If the String is too long,an 
	 * java.lang.NumberFormatException will be throwed.So it's also no good.
	 */
	public static String addBinary2(String a,String b){
		int result  = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
		return Integer.toBinaryString(result);
	}
}
