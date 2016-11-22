package stg.algorithm.day18;

import java.util.Stack;

/**
 * The question is:
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.The brackets must close in the correct 
 * order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * @author stg
 *
 */
public class Algorithm {
	
	/**
	 * use a stack to match the pairs,it's a useful trick on pairing question.
	 */
	public static boolean isValid(String s) {
        if (s == null || s.length() % 2 == 1)
			return false;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); ++i) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else {
				if (stack.isEmpty())
					return false;
				char last = stack.pop();
				if(ch == ')' && last != '(') return false;
				else if(ch == ']' && last != '[') return false;
				else if(ch == '}' && last != '{') return false;
			}
		}
		return stack.isEmpty();
    }
}
