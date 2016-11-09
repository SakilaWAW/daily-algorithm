package stg.tools;

import java.util.ArrayList;
import java.util.List;

/**
 * A tool intents to simplify string type check operation.
 * @author stg
 *
 */
public class StringTypeChecker{
	
	/**
	 * Return if a string can turn to a integer.
	 * (contains positive and negative integer)
	 * @param str target string
	 * @return true:is integer,false:not
	 */
	public static boolean isInteger(String str){
		if(str == null) return false;
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
		if(str == null) return false;
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
		if(str == null) return false;
		String[] str_arr = str.split(regex);
		for(int i =0 ; i<str_arr.length ; ++i){
			if(str_arr[i].isEmpty() || !isInteger(str_arr[i])){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Return if a string is an English letter.
	 * @param str 
	 * @return true:yes,false:not
	 */
	public static boolean isALetter(String str){
		if(str == null) return false;
		if(str.length()==1 && Character.isLetter(str.charAt(0))){
			return true;
		}else{
			return false;
		}
	}
	
	
	/**
	 * return if a string is an English punctuation.<br/>
	 * the punctuation contains:<br/>
	 * , and . and ' and " and ? and ! and - and :
	 * @param str
	 * @return true if the string is a English Punctuation,false otherwise.
	 */
	public static boolean isAEnglishPunctuation(String str){
		if(str == null) return false;
		List<Character> punctuations = new ArrayList<>();
		punctuations.add(',');
		punctuations.add('.');
		punctuations.add('\'');
		punctuations.add('\"');
		punctuations.add('-');
		punctuations.add('!');
		punctuations.add('?');
		punctuations.add(':');
		punctuations.add(' ');
		if(str.length() == 1 && punctuations.contains(str.charAt(0))){
			return true;
		}
		return false;
	}
	/**
	 * return if a string is an English sentence.
	 * @return true:yes,false:not
	 */
	public static boolean isEnglishSentence(String str){
		if(str == null) return false;
		for(int i = 0; i<str.length(); ++i){
			if(!isALetter(str.charAt(i)+"") && !isAEnglishPunctuation(str.charAt(i)+"")){
				return false;
			}
		}
		return true;
	}

	
}
