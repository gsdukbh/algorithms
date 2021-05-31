## 二叉树最大深度

思路：

利用深度优先遍历获取树的深度。

[代码](../../../leetcode/app/src/main/java/top/werls/leetcode/MaxDepth.java)

```java
 public static int maxDepth(TreeNode root) {
        if (root != null) {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
        return 0;

    }
```



