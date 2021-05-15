## 计数质数



##### 思路：试除法。

[代码](../../leetcode/app/src/main/java/top/werls/leetcode/CountPrimes.java)

```java
public static int countPrimes(int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (isPrimes(i)) {
                res++;
            }
        }

        return res;
    }

    public static boolean isPrimes(int n) {
        if (n <= 3) {
            return n > 1;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
```



##### 思路：**埃拉托斯特尼筛法** 

```java
public static int countPrimes1(int n) {
        int res = 0, sqrtN = (int) Math.sqrt(n);
        boolean[] b = new boolean[n];
        // 初始化默认值都为 false，为质数标记
        if (2 < n) {
            res++;
        }
        // 如果大于 2 则一定拥有 2 这个质数
        for (int i = 3; i < n; i += 2) {
            // 从 3 开始遍历，且只遍历奇数
            if (!b[i]) {
                // 是质数
                if (i <= sqrtN)
                //不大于根号n
                {
                    for (int j = i; i * j < n; j += 2) {
                        b[i * j] = true;
                    }
                }
                // 将当前质数的奇数倍都设置成非质数标记 true
                res++;
                // 质数个数 +1
            }
        }
        return res;
    }
```

