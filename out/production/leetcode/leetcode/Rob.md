## 打家劫舍 Ⅲ

问题核心: 一颗二叉树上的节点值，为可以获取的金额。但是在直接相连的节点打劫会自动报警。求在不报警的情况下获取最高金额。

#### 分析：

在三层的二叉树下，最多有每层1 ，2 ，4 个节点。 因为不能在直接相连的节点打劫，只能是第一层和第三层全部拿，或者第2 层拿。

那么就是1;`money=root.val+root.left.left+root.left.right.val+root.right.left+root.right.right` 

2；`money=root.left+root.right`

 取这个俩个的最大值。使用深度搜索的方式，

[代码](Rob.java)

```java
public static int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int money = root.val;
        if (root.left != null) {
            money += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            money += rob(root.right.left) + rob(root.right.right);
        }

        return Math.max(money, rob(root.left) + rob(root.right));
    }
```



#### 记忆化

使用一个map来保存已经搜索过的值。减少重复计算。

```java
static Map<TreeNode, Integer> memory = new HashMap<>();

    public static int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (memory.containsKey(root)) {
            return memory.get(root);
        }
        int money = root.val;
        if (root.left != null) {
            money += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            money += rob(root.right.left) + rob(root.right.right);
        }
        int res = Math.max(money, rob(root.left) + rob(root.right));
        memory.put(root, res);
        return res;
    }
```

