package stg.dailyalgorithm.day1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		//paras:start,step,length
		int[] paraArr = new int[] { 0, 0, 0 };
		while (true) {
			System.out.println("please input three integers which refer to " +
					"the start,step,length of the arithmetic progression(" +
					"separate with ','):");
			String paraString = scanner.nextLine();
			String[] paras = paraString.split(",");
			if(paras.length != 3 || paraString.contains(".")){
				System.out.println("input the paras in required format plz.");
				continue;
			}else{
				for(int i = 0; i<3; ++i){
					paraArr[i] = Integer.parseInt(paras[i]);
				}
				break;
			}
		}
		Algorithm algorithm = new Algorithm();
		System.out.println(algorithm.calculate(paraArr[0]
												, paraArr[1]
												, paraArr[2]));
		scanner.close();
	}

}
