package Sep20_1_8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhupd on 12/26/2016.
 */
public class PascalsTriangle_118 {
   /* public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();
        temp.add(0, 1);
        temp.add(0, 2);
        for (int x : temp) {
            System.out.println(x);
        }
    }*/

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle =
                new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i ++) {
            List<Integer> colunms = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if (j == 0 || j == i) {
                    colunms.add(j, 1);
                } else {
                    colunms.add(j, triangle.get(i - 1).get(j - 1) +
                            triangle.get(i - 1).get(j));
                }
            }
            triangle.add(i, colunms);
        }
        return triangle;
    }
}
