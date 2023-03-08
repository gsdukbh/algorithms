package top.werls.leetcode;

public class IsSameTree {
    /**
     * 深度遍历判读是否一致
     * 
     * @param p
     * @param q
     * @return boolean
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null || q.val != p.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}