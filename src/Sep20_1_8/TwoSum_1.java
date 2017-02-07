package Sep20_1_8;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhupd on 12/20/2016.
 * Number 1
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution.
 */
public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {4,2,3,7};
        int[] temp = twoSum(nums, 5);
        for (int x: temp) {
            System.out.println(x);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dic = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int comp = target - nums[i];
            if (dic.containsKey(comp)) {
                return new int[]{dic.get(comp), i};
            }
            dic.put(nums[i], i);
        }
        throw new IllegalArgumentException("no solution");
    }
}
