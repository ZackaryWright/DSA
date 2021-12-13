import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
/*
	O(n) Time complexity
	O(1) Space complexity
*/
		int sIndex = 0;
		
		for(int i = 0; i < array.size(); i++) {
			if(array.get(i) == sequence.get(sIndex)) {
				sIndex++;
			}
			
			if(sIndex >= sequence.size()) {
				return true;
			}
		}
		
		return sIndex >= sequence.size();
  }
}
