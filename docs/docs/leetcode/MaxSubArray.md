## 最大子序列和

动态规划：



```java
 public static int maxSubArray(int[] nums) {
        int max = nums[0], tem = 0;
        for (int value :
                nums) {
            tem = Math.max(tem + value, value);
            max = Math.max(max, tem);
        }
        return max;
    }
```

