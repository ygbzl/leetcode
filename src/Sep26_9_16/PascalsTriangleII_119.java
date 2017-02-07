package Sep26_9_16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhupd on 12/26/2016.
 */
public class PascalsTriangleII_119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++) {
            list.add(0,1);
            for(int j=1; j<list.size()-1;j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }
        return list;
    }
}
