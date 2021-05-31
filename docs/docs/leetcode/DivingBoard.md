## 跳水板

思路，

我们可以观察题目，运用初中的知识得出长度的函数，


$$
Z=(K-X)*Shore+X*longer
$$


这里 Z 是拼接出长度的值，k为木板数量，x为使用长度为longer的数量。

代码：

```java
class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
       
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] lengths = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            lengths[i] = shorter * (k - i) + longer * i;
        }
        return lengths;
    }
}
```

