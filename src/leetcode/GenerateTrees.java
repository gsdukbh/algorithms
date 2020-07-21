package leetcode;

import java.util.ArrayList;

import java.util.List;

public class GenerateTrees {

    public static void main(String[] args) {
        List<TreeNode> res = generateTrees_1(3);
        for (TreeNode treeNode : res) {
            System.out.println(treeNode.Preorder(treeNode));
        }
    }

    /**
     * 0 <= n <= 8 搜索二叉树
     * 
     * @param n
     * @return List<TreeNode>
     */
    public static List<TreeNode> generateTrees(int n) {
        List<TreeNode> res = new ArrayList<>();
        if (n == 0) {

            return res;
        }
        res.add(null);
        for (int i = 1; i <= n; i++) {
            List<TreeNode> temp = new ArrayList<>();
            for (TreeNode treeNode : res) {
                System.out.println(treeNode);
                System.out.println(i);
                TreeNode iNode = new TreeNode(i);
                iNode.left = treeNode;
                temp.add(iNode);
                for (int j = 0; j <= n; j++) {
                    TreeNode cNode = clone(treeNode);
                    TreeNode rNode = cNode;
                    for (int k = 0; k < j; k++) {
                        if (rNode == null) {
                            break;
                        }
                        rNode = rNode.right;
                    }
                    if (rNode == null) {
                        break;
                    }
                    TreeNode rTreeNode = rNode.right;
                    iNode = new TreeNode(i);
                    rNode.right = iNode;
                    iNode.left = rTreeNode;
                    temp.add(cNode);
                }
            }
            res = temp;
        }
        return res;
    }

    public static TreeNode clone(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode node = new TreeNode(root.val);
        node.left = clone(root.left);
        node.right = clone(root.right);
        return node;
    }

    public static List<TreeNode> generateTrees_1(int n) {
        List<TreeNode> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        return generateTrees_(1, n);
    }

    public static List<TreeNode> generateTrees_(int l, int r) {
        List<TreeNode> res = new ArrayList<>();
        if (l > r) {
            res.add(null);
            return res;
        }
        for (int i = l; i <= r; i++) {
            List<TreeNode> left = generateTrees_(l, i - 1);
            List<TreeNode> righ = generateTrees_(i + 1, r);
            for (TreeNode treeNode : left) {
                for (TreeNode treeNode2 : righ) {
                    TreeNode tem = new TreeNode(i);
                    tem.left = treeNode;
                    tem.right = treeNode2;
                    res.add(tem);
                }
            }
        }
        return res;
    }

}
