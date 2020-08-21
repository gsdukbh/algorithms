package leetcode;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/21 15:15
 */
public class SortedArrayToBinarySearchTree {
    public static TreeNode sortedArrayToBinarySearchTree(int[] nums) {

        return bfs(0, nums.length - 1, nums);
    }

    public static TreeNode bfs(int left, int right, int[] nums) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = bfs(left, mid - 1, nums);
        node.right = bfs(mid + 1, right, nums);
        return node;
    }

}
