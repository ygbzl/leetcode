package Feb23_81_88;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhupd on 2/25/2017.
 */
public class Subsets_78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new LinkedList<>();
        if(nums==null || nums.length==0) return res;

        int stand=1 <<nums.length;
        for(int i=0;i<stand;i++){
            List<Integer> list=new LinkedList<>();
            for(int j=0;j<nums.length;j++){
                if((i & (1<<j)) !=0)
                    list.add(nums[j]);
            }
            res.add(list);
        }

        return res;

    }  


/*
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new LinkedList<>();
        if(nums==null || nums.length==0) return res;

        res.add(new LinkedList<Integer>());
        for(int x:nums){
            List<List<Integer>>  temp=new LinkedList<>();

            for(List<Integer> tempList:res) {
                List<Integer> cur=new LinkedList<>(tempList);
                cur.add(x);
                temp.add(cur);

            }
            res.addAll(temp);
        }
        return res;

    }
*/


/*    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list=new LinkedList<>();
        if(nums==null||nums.length==0) return list;
        //Arrays.sort(nums);
        backTrack(list, new LinkedList<Integer>(), nums, 0);
        return list;
    }

    void backTrack(List<List<Integer>> list, LinkedList<Integer> temp, int[] nums, int i){
        list.add(new LinkedList<Integer>(temp));
        for(int j=i;j<nums.length;j++){
            temp.add(nums[j]);
            backTrack(list,temp,nums,j+1);
            temp.remove(temp.size()-1);
        }
    }*/
}
