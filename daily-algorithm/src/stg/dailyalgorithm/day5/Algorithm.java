package stg.dailyalgorithm.day5;

/**
 * The question is:<br/>
 * Calculate the preorder traverse of a binary tree according to the inorder
 * traverse and the postorder traverse.(every node in the binary tree is
 * different)
 * 
 * @author stg
 * 
 */
public class Algorithm {

	/**
	 * entrance of the algorithm.
	 * 
	 * @param inorder_str
	 * @param postorder_str
	 * @return preorder string
	 */
	public String calculate(String inorder_str, String postorder_str) {
		String result = "";
		// troubleshooting
		if (inorder_str.length() == postorder_str.length()
				&& !ContainsDuplicateLetter(inorder_str)
				&& !ContainsDuplicateLetter(postorder_str)) {

			try {
				result = func1(inorder_str, postorder_str);
			} catch (StringNotReasonableException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * judge the string if there is duplicate letter, it's not allowed in the
	 * strings.
	 * 
	 * @param str
	 *            target string
	 * @return true:duplicated,false:not duplicated
	 */
	private boolean ContainsDuplicateLetter(String str) {
		if ("".equals(str)) {
			return false;
		}
		for (int i = 0; i < str.length() - 1; ++i) {
			for (int j = i + 1; j < str.length(); ++j) {
				if (str.charAt(i) == str.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * The core operation is to find the root node.<br/>
	 * No matter how we traverse,it is a recursion in deed. So we need to seek
	 * the root node in every recursion so that we can solve the problem.<br/>
	 * Here is the steps:<br/>
	 * 1.We can get the root node of the whole binary tree directly, cause it is
	 * absolutely the last node in postorder_str.<br/>
	 * 2.Then we can get the left branch and the right branch of the root node
	 * through the inorder_str.<br/>
	 * 3.Do the step 1 & 2 to the left branch and the right branch.<br/>
	 * A thought of recursion.<br/>
	 * 
	 * PS:The algorithm doesn't consider if the inorder_str is reasonable to the
	 * postorder_str.
	 * 
	 * @param inorder_str
	 * @param postorder_str
	 * @return preorder string
	 * @throws StringNotReasonableException
	 */
	private String func1(String inorder_str, String postorder_str)
			throws StringNotReasonableException {
		// return empty if string is empty
		if ("".equals(inorder_str) || "".equals(postorder_str)) {
			return "";
		}
		if (!isReasonable(inorder_str, postorder_str)) {
			throw new StringNotReasonableException();
		}
		// default empty
		int left_branch_length = 0;
		int right_branch_length = 0;
		String inorder_left_branch = "";
		String inorder_right_branch = "";
		String postorder_left_branch = "";
		String postorder_right_branch = "";
		// the last node of the postorder_str is the root node.
		char root_node = postorder_str.charAt(postorder_str.length() - 1);
		// add root node to the preorder_str.
		int root_index = inorder_str.indexOf(root_node);
		if (root_index != 0) {// left branch is not empty
			inorder_left_branch = inorder_str.substring(0, root_index);
			left_branch_length = inorder_left_branch.length();
			postorder_left_branch = postorder_str.substring(0,
					left_branch_length);
		}
		if (root_index != inorder_str.length() - 1) {// right branch is not
														// empty
			inorder_right_branch = inorder_str.substring(root_index + 1);
			right_branch_length = inorder_right_branch.length();
			postorder_right_branch = postorder_str.substring(
					postorder_str.length() - right_branch_length - 1,
					postorder_str.length() - 1);
		}

		return root_node + func1(inorder_left_branch, postorder_left_branch)
				+ func1(inorder_right_branch, postorder_right_branch);
	}

	/**
	 * judge if the inorder_str is reasonable to postorder_str. (Has there any
	 * letter in inorder_str but not in postorder_str?)
	 * 
	 * @param inorder_str
	 * @param postorder_str
	 * @return true:reasonable,false:unreasonable
	 */
	private boolean isReasonable(String inorder_str, String postorder_str) {
		boolean flag = true;
		if (inorder_str.length() != postorder_str.length()) {
			flag = false;
		} else {
			for (int i = 0; i < inorder_str.length(); ++i) {
				// there is a letter in inorder_str but not in postorder_str
				if (!postorder_str.contains(inorder_str.charAt(i) + "")) {
					flag = false;
				}
			}
		}
		return flag;
	}

	private class StringNotReasonableException extends Exception {

		private static final long serialVersionUID = 1L;

		public String getMessage() {
			return "inorder_str is unreasonable to postorder_str";
		}

	}
}
