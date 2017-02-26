package Feb23_73_80;

/**
 * Created by zhupd on 2/23/2017.
 */
public class TrappingRainWate_42 {
    public int trap(int[] height) {
        int res = 0, begin = 0, end = height.length - 1;
        int lh = 0, rh = 0;
        while (begin < end) {
            lh = Math.max(lh, height[begin]);
            rh = Math.max(rh, height[end]);
            if (lh < rh) {
                res += lh - height[begin];
                begin++;
            } else {
                res += rh - height[end];
                end--;
            }
        }
        return res;
    }
}
