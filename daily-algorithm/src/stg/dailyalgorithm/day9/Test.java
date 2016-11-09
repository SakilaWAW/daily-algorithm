package stg.dailyalgorithm.day9;

import java.util.Scanner;

import stg.tools.NumericCheck;

public class Test {

	public static void main(String[] args) {
		Scanner scanner;
		while (true) {
			scanner = new Scanner(System.in);
			System.out.println("please input the target linked list" +
									"(values separate with ','):");
			String values = scanner.nextLine();
			System.out.println("please input the target index(reverse):");
			int target_index = scanner.nextInt();
			if (NumericCheck.isIntegerArray(values, ",")
					&& NumericCheck.isPositiveInteger(target_index + "")) {
				initLinkedlist(values,",");
				Algorithm algorithm = new Algorithm();
				Node head = initLinkedlist(values,",");
				if(algorithm.calculate1(head,target_index)){
					break;
				}
			} else {
				System.out.println("input the value in required format,plz.");
			}
		}
		scanner.close();
	}

	/**
	 * initial the linked list by the input
	 * @param values values in the linked list(one node one value)
	 * @param regex regex of the string
	 * @return head node of the list
	 */
	private static Node initLinkedlist(String values,String regex) {
		Node head = new Node();
		Node now = head;
		String[] values_str_arr = values.split(regex);
		for(int i=0;i<values_str_arr.length; ++i){
			now.setValue(Integer.parseInt(values_str_arr[i]));
			if(i!= values_str_arr.length-1){
				now.setNext(new Node());
			}
			now = now.next();
		}
		return head;
	}

}
