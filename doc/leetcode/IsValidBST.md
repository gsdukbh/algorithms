## 验证二叉搜索树

中序遍历二叉树， 若是二叉搜索树，则中序遍历是升序。



```java
public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        long in = Long.MIN_VALUE;
        while (!stack.isEmpty() || root != null) {
//            left
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= in) {
                return false;
            }
            in = (long) root.val;
            root = root.right;
        }
        return true;
    }
```

