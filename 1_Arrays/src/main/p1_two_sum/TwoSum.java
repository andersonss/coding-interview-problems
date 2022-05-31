package p1_two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public int[] twoSumNaive(int[] nums, int target) { // O(n^2)
        for (int i = 0; i < nums.length; i++) { // O(n)
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) { // O(n*n) = O(n^2)
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No match found!");
    }
    public int[] twoSumOpt(int[] nums, int target) { // O(n)
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) { // O(n)
           int complement = target - nums[i];
           if (numMap.containsKey(complement)) { // O(1)
               return new int[] {numMap.get(target - nums[i]), i};
           }
           numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No match found!");
    }

    public int[] twoSumUdemy(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentMapVal = numMap.getOrDefault(nums[i], -1);
            if (currentMapVal >= 0) {
                return new int[]{currentMapVal, i};
            } else {
                int numberToFind = target - nums[i];
                numMap.put(numberToFind, i);
            }
        }
        throw new IllegalArgumentException("No match found!");
    }
}
