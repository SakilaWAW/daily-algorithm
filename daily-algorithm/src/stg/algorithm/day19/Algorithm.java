package stg.algorithm.day19;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * For example, 
 * Given s = "Hello World",
 * return 5.
 * 
 * @author stg
 *
 */
public class Algorithm {
	
	/**
	 * the algorithm is quite easy,read from the end,and count.
	 * This algorithm solve the problem without Java built-in function.
	 */
    public static int lengthOfLastWord1(String s) {
        if(s == null || s.length() == 0) return 0;
        int index = s.length() - 1;
        int count = 0;
        while(index >= 0){
            char ch = s.charAt(index);
            if(ch == ' '){//consider of the condition of "end with ' '"
              if(count != 0) break;  
            } else{
            	++count;
            }
            --index;
        }
        return count;
    }
    
    /**
     * solve the problem with Java built-in function,it's as efficient as function1.
     */
    public static int lengthOfLastWord2(String s){
    	return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
}
