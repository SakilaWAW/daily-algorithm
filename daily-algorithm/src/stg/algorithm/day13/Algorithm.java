package stg.algorithm.day13;

/**
 * The question is: The string "PAYPALISHIRING" is written in a zigzag pattern
 * on a given number of rows like this: (you may want to display this pattern in
 * a fixed font for better legibility) 
 * P A H N 
 * APLSIIG 
 * Y I R 
 * And then read line by line: 
 * "PAHNAPLSIIGYIR" Write the code that will take a string and
 * make this conversion given a number of rows:
 * 
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * 
 * @author stg
 * 
 */
public class Algorithm {
	
	/**
	 * this function is like drawing the string in a canvas(char[][])
	 * It's easy to understand but not good in efficiency.It only beats 35%.
	 */
	public static String convertInSimpleThought(String s, int numRows) {
		int numsInOneGroup = numRows - 1;
		int groupNum = s.length() / numsInOneGroup;

		int colNum = groupNum / 2 * numsInOneGroup;
		if (s.length() % (2 * numsInOneGroup) <= (numsInOneGroup + 1)) {
			colNum += 1;
		} else {
			colNum = colNum + s.length() % (2 * numsInOneGroup)
					- numsInOneGroup;
		}
		char[][] result = new char[numRows][colNum];

		int index = 0;
		int row = 0;
		int col = 0;
		while (index < s.length()) {
			result[row][col] = s.charAt(index);
			if (index / numsInOneGroup % 2 == 1) {
				--row;
				++col;
			} else {
				++row;
			}
			++index;
		}

		String ret = "";
		for (int i = 0; i < numRows; ++i) {
			for (int j = 0; j < colNum; ++j) {
				if (result[i][j] != '\u0000') {// default char is \u0000 in java
					ret += result[i][j];
				}
			}
		}
		return ret;
	}

	/**
	 * This method is found on the Internet.It's good on efficiency.
	 * It's like a math problem in deed.It beats 75% algorithms.
	 * It's core thought is to print final result line by line.
	 */
	public static String convertInGoodEfficiency(String s, int numRows) {
		if (numRows <= 1) {
			return s;
		}
		int n = s.length();
		int step = 2 * numRows - 2;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			for (int j = i; j < n; j += step) {
				sb.append(s.charAt(j));
				if (i != 0 && i != numRows - 1 && j + step - 2 * i < n) {
					sb.append(s.charAt(j + step - 2 * i));
				}
			}
		}
		return sb.toString();
	}
}
