package stg.dailyalgorithm.day9;

/**
 * node in the linked list.
 * @author stg
 *
 */
public class Node {
	
	private int value;
	
	/**
	 * pointer to next node
	 */
	private Node next;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * @return next node in the linked list
	 */
	public Node next(){
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}
