package Feb22_65_72;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 * Created by zhupd on 2/23/2017.
 */
public class SlidingWindowMaximum_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || k>nums.length ||nums.length==0) return new int[0];

        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0,cur=0;i<nums.length;i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if(i>=k-1) {
                res[cur] = nums[deque.peek()];
                cur++;
            }
        }
        return res;

    }
}
