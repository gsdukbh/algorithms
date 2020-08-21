## 回文子串

思路：

动态规划，中心扩展的方式

[参考](Fives.md) 其中的`2n-1`是为了防止字符串的长度出现奇偶，中间字符一个或两个的问题。

```java
public static int countSubstrings(String s) {
        int length = s.length(), res = 0;
        for (int i = 0; i < 2 * length - 1; i++) {
            int L = i / 2, R = i / 2 + i % 2;
            while (L >= 0 && R < length && s.charAt(L) == s.charAt(R)) {
                L--;
                R++;
                res++;
            }
        }
        return res;
    }
```

