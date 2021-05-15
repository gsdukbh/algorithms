## 平衡二叉树

判断一颗树是否为平衡二叉树。任意节点的子树的高度差都小于等于1.

##### 思路：深度遍历，自底向上计算。

[代码](../../leetcode/app/src/main/java/top/werls/leetcode/IsBalanced.java)

```java
public boolean isBalanced(TreeNode root) {
        return maxDepth(root)>=0;
    }

    public static  int maxDepth(TreeNode root){
        if (root==null){
            return 0;
        }else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            if (left==-1||right==-1|| Math.abs(left-right) >1){
                return -1;
            }else {
                return Math.max(left, right) + 1;
            }
        }
    }
```

