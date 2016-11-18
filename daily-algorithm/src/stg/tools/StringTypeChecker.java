package stg.tools;

import java.util.ArrayList;
import java.util.List;

/**
 * A tool intents to simplify string type check operation.
 * 
 * @author stg
 * 
 */
public class StringTypeChecker {

	/**
	 * Return if a string can turn to a integer. (contains positive and negative
	 * integer)
	 * 
	 * @param target
	 *            target string
	 * @return true:is integer,false:not
	 */
	public static boolean isInteger(String target) {
		if (target == null)
			return false;
		if (target.matches("^-?\\d+$")) {
			return true;
		}
		return false;
	}

	/**
	 * Return if a string can turn to a positive integer.
	 * 
	 * @param target
	 *            target string
	 * @return true:is positive integer,false:not
	 */
	public static boolean isPositiveInteger(String target) {
		if (target == null)
			return false;
		if (target.matches("^[0-9]*[1-9][0-9]*$")) {
			return true;
		}
		return false;
	}
	
	/**
	 * Return if a string can turn to a non-negative integer.
	 * 
	 * @param target
	 *            target string
	 * @return true:is positive integer,false:not
	 */
	public static boolean isNonNegativeInteger(String target) {
		if (target == null)
			return false;
		if (target.matches("^\\d+$")) {
			return true;
		}
		return false;
	}

	/**
	 * Return if a string is can turn into a integer array.
	 * 
	 * @param target
	 *            target string
	 * @param regex
	 *            the separator of the array.
	 * @return true:is integer array,false:not
	 */
	public static boolean isBinaryTree(String target,String splitRegex) {
		if (target == null) return false;
		String[] str_arr = target.split(splitRegex);
		for (int i = 0; i < str_arr.length; ++i) {
			if (str_arr[i].isEmpty() || (!isInteger(str_arr[i]) && !str_arr[i].equals("#"))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Return if a string is can turn into a integer array.
	 * 
	 * @param target
	 *            target string
	 * @param regex
	 *            the separator of the array.
	 * @return true:is integer array,false:not
	 */
	public static boolean isIntegerArray(String target, String splitRegex) {
		if (target == null)
			return false;
		String[] str_arr = target.split(splitRegex);
		for (int i = 0; i < str_arr.length; ++i) {
			if (str_arr[i].isEmpty() || !isInteger(str_arr[i])) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Return if a string is can turn into a non-negative integer array.
	 * 
	 * @param target
	 *            target string
	 * @param regex
	 *            the separator of the array.
	 * @return true:is integer array,false:not
	 */
	public static boolean isNonNagativeIntegerArray(String target, String splitRegex) {
		if (target == null)
			return false;
		String[] str_arr = target.split(splitRegex);
		for (int i = 0; i < str_arr.length; ++i) {
			if (str_arr[i].isEmpty() || !isNonNegativeInteger(str_arr[i])) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Return if a string is an English letter.
	 * 
	 * @param target
	 * @return true:yes,false:not
	 */
	public static boolean isALetter(String target) {
		if (target == null)
			return false;
		if (target.length() == 1 && Character.isLetter(target.charAt(0))) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * return if a string is an English punctuation.<br/>
	 * the punctuation contains:<br/>
	 * , and . and ' and " and ? and ! and - and :
	 * 
	 * @param target
	 * @return true if the string is a English Punctuation,false otherwise.
	 */
	public static boolean isAEnglishPunctuation(String target) {
		if (target == null)
			return false;
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
		if (target.length() == 1 && punctuations.contains(target.charAt(0))) {
			return true;
		}
		return false;
	}

	/**
	 * return if a string is an English sentence.
	 * 
	 * @return true:yes,false:not
	 */
	public static boolean isEnglishSentence(String target) {
		if (target == null)
			return false;
		for (int i = 0; i < target.length(); ++i) {
			if (!isALetter(target.charAt(i) + "")
					&& !isAEnglishPunctuation(target.charAt(i) + "")) {
				return false;
			}
		}
		return true;
	}

	/**
	 * return if all of the characters in target English letter.
	 */
	public static boolean isAllLetters(String target) {
		if (target == null)
			return false;
		if (target.matches("[a-zA-z]*")) {
			return true;
		}
		return false;
	}
}
