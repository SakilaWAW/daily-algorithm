package stg.dailyalgorithm.day6day7;

public class ShellSort extends Sort {

	public ShellSort(int[] target_arr) {
		super(target_arr);
	}

	@Override
	public void sort() {
		if (m_array != null) {
			shellSort(m_array);
			printResult(true);
		} else {
			printResult(false);
		}
	}

	/**
	 * Shell sort: .A improvement of insert sort. .Add a concept of step.
	 * .Separate the array into lots of short array so that we can make the
	 * array basically in order in less steps. .How separate the array depends
	 * on the value of step.
	 * 
	 * @param target_arr
	 */
	private void shellSort(int[] target_arr) {
		// step is the improvement to insert sort
		// how to choose the value of  
		int step = target_arr.length / 3;
		while (step > 0) {
			for (int index = 0; index < target_arr.length; index += step) {
				int num = target_arr[index];
				int compare_index = index - step;
				while (compare_index >= 0) {
					if (num < target_arr[compare_index]) {
						// push
						target_arr[compare_index + step] = target_arr[compare_index];
					} else {
						break;
					}
					compare_index -= step;
				}
				target_arr[compare_index + step] = num;
			}
			step /= 2;
		}
	}

	@Override
	public String getName() {
		return "Shell sort";
	}

}
