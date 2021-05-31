## 打家劫舍 Ⅲ

问题核心: 一颗二叉树上的节点值，为可以获取的金额。但是在直接相连的节点打劫会自动报警。求在不报警的情况下获取最高金额。

#### 分析：

在三层的二叉树下，最多有每层1 ，2 ，4 个节点。 因为不能在直接相连的节点打劫，只能是第一层和第三层全部拿，或者第2 层拿。

那么就是：

1：`money=root.val+root.left.left+root.left.right.val+root.right.left+root.right.right` 

2：`money=root.left+root.right`

 取这个俩个的最大值。使用深度搜索的方式，

[代码](../../../leetcode/app/src/main/java/top/werls/leetcode/Rob.java)

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

## 打家劫舍 Ⅰ

这侧输入的格式为数组。房子是成线条装排列的。

我们可以使用动态规划来解决问题。

因为在相邻的房子偷取，会报警。假设当前小偷到的第i房子时，那么有

1：不偷：`f(i-1)` 前的钱。

2：偷：`f(i-2)` 的钱。不能偷相邻的位置。

```java
if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i - 2] + dp[i]);
        }
        return dp[nums.length - 1];
```



##### 思路：2

滑动数组

```java
public static int rob(int[] nums) {
        int first = 0;
        int second = 0;
        for (int i : nums) {
            int temp = second;
            second = Math.max(second, first + i);
            first = temp;
        }
        return second;
    }
```



