## 3的幂



##### 思路：迭代。

```java
public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
```



##### 思路：换底公式

参考：[维基对数恒等式](https://zh.wikipedia.org/wiki/%E5%AF%B9%E6%95%B0%E6%81%92%E7%AD%89%E5%BC%8F)

```java
  public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
```

公式：
$$
\frac {\log_{10}n} {\log_{10}3}=\log_3n
$$
