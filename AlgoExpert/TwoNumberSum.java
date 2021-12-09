import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
//  O(n) Time Complexity | O(n) Space Complexity
		
		int[] output = new int[2];
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i < array.length; i++) {
			int diff = targetSum - array[i];
			if(map.containsKey(diff)) {
				output[0] = diff;
				output[1] = array[i];
				return output;
			}
			map.put(array[i], i);
		}
		
    return new int[0];
  }
}
