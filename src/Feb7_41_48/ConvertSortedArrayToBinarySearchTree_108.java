package Feb7_41_48;

/**
 * Created by zhupd on 2/7/2017.
 */
public class ConvertSortedArrayToBinarySearchTree_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return null;
        }
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, start, mid-1);
        node.right = helper(nums, mid + 1, end);
        return node;
    }
}
