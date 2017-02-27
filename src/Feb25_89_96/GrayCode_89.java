package Feb25_89_96;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peidong on 2/26/17.
 */
public class GrayCode_89 {
    public List<Integer> grayCode(int n) {
        List<Integer> res=new ArrayList<>();
        res.add(0);

        for(int i=0;i<n;i++){
            int temp=1 << i;
            for(int k=res.size()-1;k>=0;k--){
                res.add(res.get(k)+temp);
            }
        }
        return res;

    }
}
