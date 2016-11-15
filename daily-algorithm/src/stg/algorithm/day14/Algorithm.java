package stg.algorithm.day14;

/**
 * The question is:
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * Example 1:
 * Given s = "hello", return "holle".
 *
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 * @author stg
 *
 */
public class Algorithm {
	
	public static String getReverseVowelsString(String target){
		if(target.length() == 0 || target.length() == 1) return target;
		int front = 0;
		int back = target.length()-1;
		char[] target_chars = target.toCharArray();
		
		while(front < back){
			while(front < back && !isVowel(target_chars[front])){
				++front;
			}
			while(front < back && !isVowel(target_chars[back])){
				--back;
			}
			if(front != back){
				switchTwoNumInArray(target_chars, front, back);
				++front;
				--back;
			}
		}
		return String.valueOf(target_chars);
	}
	
	private static boolean isVowel(char ch){
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
				|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
			return true;
		return false;
	}
	
	private static void switchTwoNumInArray(char[] target,int index1,int index2){
		char temp = target[index1];
		target[index1] = target[index2];
		target[index2] = temp;
	}
}
