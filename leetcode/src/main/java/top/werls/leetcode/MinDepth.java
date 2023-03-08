package top.werls.leetcode;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/21 9:30
 */
public class MinDepth {
        public int minDepth(TreeNode root) {
            if (root != null) {
                int left = minDepth(root.left);
                int right = minDepth(root.right);
                return root.left == null || root.right == null ?
                        left + right + 1 : Math.min(left, right) + 1;
            }
            return 0;
        }
}
