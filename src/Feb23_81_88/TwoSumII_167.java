package Feb23_81_88;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhupd on 2/24/2017.
 */
public class TwoSumII_167 {
    public int[] twoSum(int[] numbers, int target) {
        int begin=0,end=numbers.length-1;

        while(begin<end) {
            int sum=numbers[begin]+numbers[end];
            if(sum==target)
                break;
            if(sum>target) end--;
            else  if(sum<target) begin++;

        }
        return new int[] {begin+1,end+1};



       /*
        Map<Integer, Integer> map=new HashMap<>();

        int i=0;
        for(;i<numbers.length;i++){
            int temp=target-numbers[i];
            if(!map.containsKey(temp)) {
                map.put(numbers[i],i);
                continue;
            }
            return new int[] {map.get(temp)+1,i+1};
        }
        return null;
        */
    }
}
