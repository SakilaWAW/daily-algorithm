package stg.algorithm.day12;

import jdk.nashorn.internal.ir.Flags;

/**
 *Here is the question:
 *Compare two version numbers version1 and version2. 
 *If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
 *
 *You may assume that the version strings are non-empty and contain only digits and the . character.
 *The . character does not represent a decimal point and is used to separate number sequences.
 *For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
 *
 *Here is an example of version numbers ordering:
 *0.1 < 1.1 < 1.2 < 13.37
 */
public class Algorithm {
	
	/**
	 * my first thought,but it only beat 20% algorithms.It's not good.
	 * @param version1
	 * @param version2
	 * @return 1:version1>version2,-1:version1<version2,0:version1==version2
	 */
	public int compareVersionFunc1(String version1, String version2) {
        String[] version1_arr_str = version1.split("\\.");
        String[] version2_arr_str = version2.split("\\.");
        int version1_arr_length = version1_arr_str.length;
        int version2_arr_length = version2_arr_str.length;
        int[] version1_arr = new int[version1_arr_length];
        int[] version2_arr = new int[version2_arr_length];
        for(int i = 0;i<version1_arr_length; ++i){
            version1_arr[i] = Integer.parseInt(version1_arr_str[i]);
        }
        for(int i = 0;i<version2_arr_length; ++i){
            version2_arr[i] = Integer.parseInt(version2_arr_str[i]);
        }
        
        int iterLength = version1_arr_length < version2_arr_length ? version1_arr_length : version2_arr_length;
        for(int i =0 ; i < iterLength ; ++i){
            if(version1_arr[i] > version2_arr[i]) return 1;
            else if(version1_arr[i] < version2_arr[i]) return -1;
            else if(i == iterLength-1){//last index
                if(version1_arr_length == version2_arr_length) return 0;
                else if(version1_arr_length > version2_arr_length){
                    for(int j = i+1;j < version1_arr_length; ++j){
                        if(version1_arr[j] != 0) return 1;
                    }//like 1.1.0 and 1.1
                    return 0;
                }else{
                    for(int j = i+1;j < version2_arr_length; ++j){
                        if(version2_arr[j] != 0) return -1;
                    }
                    return 0;
                }
            }
        }
        return 0;
    }
	
	/**
	 * The method another people write.It's much better than function1.Amazing!
	 * It's perfectly avoid the problem of '0'.
	 */
	public int compareVersionFunc2(String version1, String version2){
		int i = 0, j = 0, len1 = version1.length() , len2 = version2.length();
		char[] ver1 = version1.toCharArray(),ver2 = version2.toCharArray();
		while(i < len1 || j < len2){
			int current1 = 0, current2 = 0;
			while( i < len1 && ver1[i] != '.') current1 = current1*10 + ver1[i++] - '0';
			while( j < len2 && ver2[j] != '.') current2 = current2*10 + ver2[j++] - '0';
			
			if(current1 > current2) return 1;
			if(current1 < current2) return -1;
			
			++i;
			++j;
		}
		return 0;
	}
}
