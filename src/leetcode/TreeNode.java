package leetcode;

import java.util.ArrayList;
import java.util.List;



/**
 * Definition for a binary tree node 定义二叉树
 */
public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        private List<Integer> res = new ArrayList<>();

        TreeNode() {

        }

        TreeNode(int x) {
                val = x;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
        }

        private void prologue(TreeNode root) {
                if (root != null) {
                        res.add(root.val);
                        prologue(root.left);
                        prologue(root.right);
                }
        }

        public List<Integer> Preorder(TreeNode root) {
                prologue(root);
                return res;
        }

        public void soutTree(TreeNode root) {
                if (root != null) {
                        System.out.println(root.val);
                        System.out.println("/");
                        soutTree(root.left);
                        System.out.println("\\");
                        soutTree(root.right);

                }
        }


}
