package stg.dailyalgorithm.day2;

/**
 * The problem is:
 * There is a positive integer,I'm about to calculate the least steps 
 * to change it to 1.
 * Step means:
 * If this number is even number,just divide it by 2.This is ONE step.
 * If this number is odd number,minus one or plus one.This is ONE step.
 * @author stg
 *
 */
public class Algorithm {
	
	/**
	 * Entrance of the algorithm
	 * @param num the number
	 * @return the least steps we need
	 */
	public int calculate(int num){
		//-1 means error
		int result2 = -1;
		int result3 = -1;
		int result = -1;
		//check special number
		if(num == 1){
			result = 1;
		}else if(num > 1){
			result2 = func2(num,true);
			result3 = func3(num,true);
		}
		//check the result of two solutions
		if(result2 == result3){
			result = result2;
		}else{
			result = -1;
		}
		return result;
	}
	
	/**
	 * How ugly the function is.(╯‵□′)╯︵┻━┻
	 * But it is my first thought.┬—┬ ノ( ' - 'ノ) 
	 * And the result is right.
	 * It has many problems.It commemorates the stupid me.
	 * DO NOT USE IT!
	 * @return the least step
	 */
	private int func1(int num){
		char[] numBinaryArr = Integer.toBinaryString(num).toCharArray();
		int steps = 0;
		//read from the last bit
		for(int index = numBinaryArr.length-1; index >=0; --index){
			if(index == 0){
				break;
			}
			//0 or 1
			int indexBit = getIndexBit(numBinaryArr,index);
			//the bit before the index bit
			int foreBit = getIndexBit(numBinaryArr,index-1);
			//when the number turns to 11 in binary
			//it's a special condition
			if(indexBit == 1 && foreBit == 1 && index == 1){
				//it needs 2 steps not 3 steps
				steps += 2;
				break;
			}
			//if the bit is 0,just plus one step then move the index
			if(indexBit == 0){
				++steps;
			}else if(foreBit == 1){//indexBit is 1 and foreBit is 1
				++num;
				numBinaryArr = Integer.toBinaryString(num).toCharArray();
				++steps;
				index += 2;
			}else{//01 condition,just plus two step and move the index
				steps += 2;
			}
		}
		return steps;
	}
	
	private int getIndexBit(char[] numBinaryArr,int index){
		return Integer.parseInt(
					String.valueOf(numBinaryArr[index]));
	}
	
	/**
	 * The loop solution with bit operation.
	 * @param num The number
	 * @param isPrintTrace if number trace is needed,true:print,false:don't print
	 * @return the least steps
	 */
	private int func2(int num,boolean isPrintTrace){
		int steps = 0;
		while(num != 1){
			//there are two conditions when 2 bit left:10 or 11
			//11 costs 2 steps,it's a special condition.
			if(num==3){
				steps += 2;
				break;
			}
			if((num & 1) == 0){//the last bit is 0
				num >>= 1;
			}else if((num & 2) == 2){//the last two bits is 11
				++num;
			}else{//the last two bits is 01
				--num;		
			}
			++steps;
			if(isPrintTrace){
				System.out.println("Step+"+steps +":num = " + num 
									+ ",Binary:"+ Integer.toBinaryString(num));
			}
		}
		return steps;
	}
	
	/**
	 * use function recursion.
	 */
	private int func3(int num,boolean isPrintTrace){
		
		if(isPrintTrace){
			System.out.println("num = " + num + ",binary = " + Integer.toBinaryString(num));
		}
		//exports of the recursion
		if(num ==3){
			return 2;
		}else if(num == 1){
			return 0;
		}
		if((num & 1) == 0){//the last bit is 0
			return 1 + func3(num >> 1,isPrintTrace);
		}else if((num & 2) == 2){//the last two bits is 11
			return 1 + func3(num + 1,isPrintTrace);
		}else{//the last two bits is 01
			return 1 + func3(num -1,isPrintTrace);
		}
	}
}
