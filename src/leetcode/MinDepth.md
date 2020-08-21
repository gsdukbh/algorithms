## 二叉树的最小深度

该题和二叉树的最大深度相似，都可以使用深度，广度遍历的方式计算深度。

```java
public int minDepth(TreeNode root) {
            if (root != null) {
                int left = minDepth(root.left);
                int right = minDepth(root.right);
                return root.left == null || root.right == null ?
                        left + right + 1 : Math.min(left, right) + 1;
            }
            return 0;
        }
```

与求最大深度不同的是，在当前节点的儿子节点为叶子节点时，返回的是左右节点深度之和加一。参考题目的示例。