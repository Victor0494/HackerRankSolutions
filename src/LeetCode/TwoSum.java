package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = result.get(nums[i]);
            Integer complement = target - nums[i];
            if(complementIndex != null) {
                return new int[]{complementIndex, i};
            }
            result.put(complement, i);
        }
        return nums;
    }
//    {5, 2, 4}
//    target = 6
//
//    HashMap
//    1 -> 0
//    4 -> 1
//
//
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        twoSum(nums, target);
    }
}
