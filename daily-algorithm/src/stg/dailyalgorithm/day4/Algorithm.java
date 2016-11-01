package stg.dailyalgorithm.day4;

/**
 * The question is:
 * There is a frog wants to jump to the top of the steps,
 * the total number of the stairs is n(user input),and the
 * frog can jump m(user input) stairs in one time.
 * How many ways can the frog reach the top?
 * @author stg
 *
 */
public class Algorithm {
	
	/**
	 * entrance of the algorithm.
	 * @param stepNum
	 * @param step
	 * @return total ways to reach the top.
	 */
	public int calculate(int stepNum,int step){
		int result = -1;
		if(stepNum > 0 && step > 0){
			result = func1(stepNum,step);
		}
		return result;
	}
	
	/**
	 * recursion function.
	 * in every recursion:
	 * 	if stepNum < step: 
	 * 		func1(stepNum,step) = func1(stepNum,stepNum);
	 * 	if stepNum >= step:
	 * 		if stepNum == 1 || stepNum ==0: func1(stepNum,step) = 1;
	 * 		else:
	 * 			func1(stepNum,step) = func1(stepNum-1,step)
	 * 									+func1(stepNum-2,step)
	 * 									+...+func1(stepNum-step,step);
	 * 
	 * PS:There is a simplification:
	 * 	for func1(n,n) = func1(n-1,n) + func1(n-2,n)+...+func1(0,n);
	 * 	and func1(n-1,n) = func1(n-2,n) + func1(n-3,n) + ...+func1(0,n);
	 * --->func1(n,n) = 2 * func1(n-1,n);
	 * --->math is miraculous (｡・`ω´･)
	 * @param stepNum
	 * @param step
	 * @return total ways to reach the top.
	 */
	private int func1(int stepNum,int step){
		if(stepNum < step){
			return func1(stepNum,stepNum);
		}else{
			if(stepNum == 1 || stepNum == 0){
				return 1;
			}else{
				int total = 0;
				for(int i=1; i<=step; ++i){
					total += func1(stepNum-i,step);
				}
				return total;
			}
		}
	}
}
