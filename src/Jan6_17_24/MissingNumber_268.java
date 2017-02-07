package Jan6_17_24;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

 For example,
 Given nums = [0, 1, 3] return 2.

 Note:
 Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 * Created by zhupd on 1/9/2017.
 */
public class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int tar = 0, sum = 0;
        for(int i=0;i<n;i++) {
            tar = tar + i;
            sum = sum + nums[i];
        }
        tar = tar + n;
        int res = tar - sum;
        return res;
    }

    public int missingNumber2(int[] nums) {
        int res = nums.length;
        for(int i=0;i<nums.length;i++) {
            res = res ^ i ^ nums[i];
        }
        return res;
    }
}
