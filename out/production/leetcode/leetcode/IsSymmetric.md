## 对称二叉树

给定一棵二叉树，判断二叉树是否对称。



##### 思路

判断对称的条件，根节点相等，左子树与右子树镜像相等。



递归：

```java
 public boolean isSymmetric(TreeNode root) {
        return recursion(root, root);
    }

    public boolean recursion(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        }
        if (l == null || r == null) {
            return false;
        }
        return l.val == r.val && recursion(l.left, r.right) && recursion(r.left, l.right);
    }
```



迭代：

```java
public boolean isSymmetric(TreeNode root) {
        return iteration(root, root);
    }

public boolean iteration(TreeNode pre, TreeNode cur) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pre);
        queue.offer(cur);
        while (!queue.isEmpty()) {
            pre = queue.poll();
            cur = queue.poll();
            if (pre == null && cur == null) {
                continue;
            }
            if (pre == null || cur == null) {
                return false;
            }
            if (pre.val != cur.val) {
                return false;
            }
            queue.offer(pre.left);
            queue.offer(cur.right);

            queue.offer(cur.left);
            queue.offer(pre.right);
        }
        return true;
    }
```

