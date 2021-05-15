package top.werls.leetcode;

import java.util.Arrays;

public class reConstructBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    /**
     * 1.前序第一个为root 1
     * 2.在中序找到 1 index 为 3
     * 3.在中序的 index[3] 前面是左子树，右边是右子树
     * 4.切割子树序列
     * 5.递归以上步骤
     * @param pre {1,2,4,7,3,5,6,8} = pre
     * @param in {4,7,2,1,5,3,8,6} = in
     * @return root
     */
    public TreeNode reConstructBinaryTree1(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0){
            return  null;
        }
        TreeNode root= new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                root.left = reConstructBinaryTree1(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                root.right = reConstructBinaryTree1(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + i, in.length));
                break;
            }
        }
        return root;
    }
}

