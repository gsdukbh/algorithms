# 112. 路径总和

给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。

给定如下二叉树，以及目标和 `sum = 22`，

```md
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1

```

返回 `true`, 因为存在目标和为 22 的根节点到叶子节点的路径 `5->4->11->2`



解；

可以通过遍历整个树的所有路径来判断，每次访问一个节点时，sum减去该节点的值，若该节点是叶子节点且sum的值为0，返回`true` ； 

代码；

```java
public class HasPathSum {
    public static void main(String[] args) {

    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
}
```

