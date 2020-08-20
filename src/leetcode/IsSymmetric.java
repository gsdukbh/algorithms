package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/20 14:18
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return recursion(root, root);
    }

    public boolean recursion(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        }
        if (l == null || r == null) {
            return false;
        }
        return l.val == r.val && recursion(l.left, r.right) && recursion(r.left, l.right);
    }

    public boolean iteration(TreeNode pre, TreeNode cur) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pre);
        queue.offer(cur);
        while (!queue.isEmpty()) {
            pre = queue.poll();
            cur = queue.poll();
            if (pre == null && cur == null) {
                continue;
            }
            if (pre == null || cur == null) {
                return false;
            }
            if (pre.val != cur.val) {
                return false;
            }
            queue.offer(pre.left);
            queue.offer(cur.right);

            queue.offer(cur.left);
            queue.offer(pre.right);
        }
        return true;
    }
}
