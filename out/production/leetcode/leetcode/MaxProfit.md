## 买股票的最佳时机 Ⅱ

##### 思路：

每天只需要对比前天赚到钱，类似与冒泡排序。把最大的利润记录下来。

[代码](MaxProfit.java)

```java
 public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                max += prices[i] - prices[i - 1];
            }
        }
        return max;
    }
```

