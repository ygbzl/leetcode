package AmazonOA2_Feb10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peidong on 2/11/17.
 */
public class WindowSum {
    public List<Integer> getSum(List<Integer> A, int k) {
        List<Integer> res = new ArrayList<>();
        int count = 0;
        for (int i =0;i<A.size();i++) {
            count++;
            if (count >= k) {
                int sum = 0;
                for(int j=i;j>=i-k;j--) {
                    sum = sum + A.get(j);
                }
                res.add(sum);
            }
        }
        return res;

    }
}