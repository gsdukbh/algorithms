## 预测赢家



1玩家总是先手，故当数组长度为偶数时，总是赢。

##### 递归

```java
public boolean predictTheWinner(int[] nums) {
        if (nums.length % 2 == 0) {
            return true;
        }
        return help(nums, 0, nums.length - 1) >= 0;
    }

    private int help(int[] nums, int le, int ri) {
        if (le == ri) {
            return nums[le];
        }
        int left = nums[le] - help(nums, le + 1, ri);
        int right = nums[ri] - help(nums, le, ri - 1);
        return Math.max(left, right);
    }
```



##### 记忆化

```java
public boolean predictTheWinner(int[] nums) {
        int length = nums.length;
        int[][] memory = new int[length][length];
        for (int i = 0; i < length; i++) {
            memory[i][i] = nums[i];
        }
        return help1(nums, memory, 0, nums.length - 1) >= 0;
    }

    private int help(int[] nums, int[][] memory, int le, int ri) {
        if (memory[le][ri] != 0) {
            return memory[le][ri];
        }
        if (le == ri) {
            memory[le][ri] = nums[le];
            return memory[le][ri];
        }
        int left = nums[le] - help1(nums, memory, le + 1, ri);
        int right = nums[ri] - help1(nums, memory, le, ri - 1);
        memory[le][ri] = Math.max(left, right);
        return memory[le][ri];
    }
```



##### 动态规划，

```java
public boolean predictTheWinner(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        System.arraycopy(nums, 0, dp, 0, length);
        for (int i = length - 2; i >= 0; i--) {
            for (int j = i + 1; j < length; j++) {
                dp[j] = Math.max(nums[i] - dp[j], nums[j] - dp[j - 1]);
            }
        }
        return dp[length - 1] >= 0;
    }
```

