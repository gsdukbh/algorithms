## 移动零

给定一个数组 `nums`，编写一个函数将所有 `0` 移动到数组的末尾，同时保持非零元素的相对顺序。

[代码](../../../leetcode/app/src/main/java/top/werls/leetcode/MoveZeroes.java)

```java
  if (nums == null || nums.length == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tem = nums[i];
                nums[i] = nums[j];
                nums[j++] = tem;
            }
        }
```

