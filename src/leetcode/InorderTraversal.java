package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回它的中序遍历.
 * @author li
 */
public class InorderTraversal {
    public List<Integer> inorderTraversalDiGui(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        diGui(root,res);
        return res;
    }
    private void diGui(TreeNode root,List<Integer> res){
        if (root!= null){
            //左子树
            if (root.left != null){
                diGui(root.left,res);
            }
            //中
            res.add(root.val);
            //右子树
            if (root.right != null){
                diGui(root.right,res);
            }
        }
    }
    public List<Integer> inorderTraversalStack(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode tmp=root;
        while (tmp != null || stack.isEmpty()){
            if (tmp != null){
                stack.push(tmp);
                tmp=tmp.left;
            }else {
                tmp=stack.pop();
                res.add(tmp.val);
                tmp = tmp.right;
            }
        }
        return res;
    }
}
