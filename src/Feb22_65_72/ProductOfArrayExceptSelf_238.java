package Feb22_65_72;

/**
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

 Solve it without division and in O(n).

 For example, given [1,2,3,4], return [24,12,8,6].
 * Created by zhupd on 2/22/2017.
 */
public class ProductOfArrayExceptSelf_238 {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] res = new int[len];
        for(int i=0,temp=1;i<len;i++) {
            res[i]=temp;
            temp = temp * nums[i];
        }
        int temp=1;
        for (int i = len - 1; i >= 0; i--) {
            res[i] = res[i] * temp;
            temp *= nums[i];
        }
        return res;


    }


}

