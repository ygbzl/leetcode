package Sep26_9_16;

import java.util.Stack;

/**
 * Created by zhupd on 1/4/2017.
 */
public class LargestRectangleInHistogram_84 {
    //hard;to be done;
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> stack = new Stack<>();
        int area = 0;
        for(int i=0;i<=len;i++) {
            int h = (i == len ? 0 : heights[i]);
            if (stack.isEmpty() | h > stack.peek()) {
                stack.push(i);
            } else {
                int bar = stack.pop();
                area = Math.max(area, heights[bar] * (stack.isEmpty() ?
                        i : i - 1 - stack.peek()));
                i--;
            }
        }
        return area;
    }
}
