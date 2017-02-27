package Feb25_89_96;

/**
 * Created by peidong on 2/26/17.
 */
public class ThirdMaximumNumber_414 {
    public int thirdMax(int[] nums) {
        long first=Long.MIN_VALUE;
        long second=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(first==nums[i]||second==nums[i]||third==nums[i]) continue;
            if(nums[i]>first){
                third=second;
                second=first;
                first=nums[i];
            }
            if(nums[i]<first && nums[i]>second) {
                third=second;
                second=nums[i];

            }
            if(nums[i]<second && nums[i]>third) {
                third=nums[i];
            }
        }
        if(third!=Long.MIN_VALUE)
            return (int)third;

        else return (int)first;

    }
}
