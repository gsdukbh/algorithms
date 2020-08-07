## 相同的树

##### 思路；  深度遍历判断两颗树是否一致。

[代码](IsSameTree.java)

```java
public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null || q.val != p.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
```

