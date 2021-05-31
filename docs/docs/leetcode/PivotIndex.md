## 寻找数组的中心引索

我们是这样定义数组 **中心索引** 的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。

#### 思路

假设 ==中心索引== 是下标为`i`的数，则有     


$$
2 \times \sum_{n=0} ^ i n = \sum_{n=0} ^ n - i
$$

当满足这个条件时，下标为`i`的 为 ==中心索引==

[代码](../../../leetcode/app/src/main/java/top/werls/leetcode/PivotIndex.java)

```java
public static int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum * 2 == sum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
```

