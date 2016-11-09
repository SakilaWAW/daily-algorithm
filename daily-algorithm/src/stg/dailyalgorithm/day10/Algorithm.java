package stg.dailyalgorithm.day10;

/**
 * The question is:<br/>
 * Given a string, determine if it is a palindrome, 
 * considering only alphanumeric characters and ignoring cases.<br/>
 * Number is unlimited.<br/>
 * For example:<br/>
 * 	"A man, a plan, a canal: Panama" is a palindrome.<br/>
 * 	"race a car" is not a palindrome.<br/>
 * @author stg
 */
public class Algorithm {
	
	public static boolean isPalindrome(String str){
		//error check
		if(str == null) return false;
		if(str.length() == 0) return true;
		
		//one pointer from head to end,another from end to head,to iterate the string.
		int start = 0;
		int end = str.length()-1;
		while(true){
			while(!Character.isLetter(str.charAt(end)) && end > 0){
				--end;
			}
			while(!Character.isLetter(str.charAt(start)) && start < end){
				++start;
			}
			if(start >= end ){
				break;
			}else{//ignore uppercase and lowercase 
				if(Character.toLowerCase(str.charAt(start)) 
						!= Character.toLowerCase(str.charAt(end))){
					return false;
				}
				--end;
				++start;
			}
		}
		return true;
	} 
}
