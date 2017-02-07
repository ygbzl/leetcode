package Sep20_1_8;

/**
 * Created by zhupd on 12/24/2016.
 */
public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[j] = nums[i];
            j++;
        }
        return j;
    }
}
