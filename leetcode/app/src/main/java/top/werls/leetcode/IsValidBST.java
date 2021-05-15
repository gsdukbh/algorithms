package top.werls.leetcode;

import java.util.Stack;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/19 17:32
 */
public class IsValidBST {

    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        long in = Long.MIN_VALUE;
        while (!stack.isEmpty() || root != null) {
//            left
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= in) {
                return false;
            }
            in = (long) root.val;
            root = root.right;
        }
        return true;
    }
}
