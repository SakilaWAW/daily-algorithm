package stg.tools;

/**
 * A tool intents to simplify numeric check operation.
 * @author stg
 *
 */
public class NumericCheck{
	
	/**
	 * Return if a string can turn to a integer.
	 * (contains positive and negative integer)
	 * @param str target string
	 * @return true:is integer,false:not
	 */
	public static boolean isInteger(String str){
		str = str.trim();
		if(str.matches("^-?\\d+$")){
			return true;
		}
		return false;
	}
	
	/**
	 * Return if a string can turn to a positive integer.
	 * @param str target string
	 * @return true:is positive integer,false:not
	 */
	public static boolean isPositiveInteger(String str){
		str = str.trim();
		if(str.matches("^\\d+$")){
			return true;
		}
		return false;
	}
	
	/**
	 * Return if a string is can turn into a integer array.
	 * @param str target string
	 * @param regex the separator of the array. 
	 * @return true:is integer array,false:not
	 */
	public static boolean isIntegerArray(String str,String regex){
		str = str.trim();
		String[] str_arr = str.split(regex);
		for(int i =0 ; i<str_arr.length ; ++i){
			if(str_arr[i].isEmpty() || !isInteger(str_arr[i])){
				return false;
			}
		}
		return true;
	}

	
}
