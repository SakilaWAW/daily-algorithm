package stg.algorithm.day21;

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 *
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * Note: The sequence of integers will be represented as a string.
 * 
 * Input:index of target String
 * Output:target String
 * 
 * @author stg
 *
 */
public class Algorithm {
	
	public static String countAndSay(int n) {
        if(n <= 0) return "";
        String result = "1";
        for(int i = 0; i < n-1; ++i){
            result = next(result);
        }
        return result;
    }
    
    private static String next(String last){
        StringBuilder result = new StringBuilder();
        char ch = last.charAt(0);
        int count = 0;
        for(int i = 0; i < last.length(); ++i){
            char thisChar = last.charAt(i);
            if(ch == thisChar){
                ++count;
            }else{
                result.append(count);
                result.append(ch);
                ch = thisChar;
                count = 1;
            }
        }
        result.append(count);
        result.append(ch);
        return result.toString();
    }
}
