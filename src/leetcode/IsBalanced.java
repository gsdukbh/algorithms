package leetcode;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/17 9:06
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root)>=0;
    }

    public static  int maxDepth(TreeNode root){
        if (root==null){
            return 0;
        }else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            if (left==-1||right==-1|| Math.abs(left-right) >1){
                return -1;
            }else {
                return Math.max(left, right) + 1;
            }
        }
    }
}
