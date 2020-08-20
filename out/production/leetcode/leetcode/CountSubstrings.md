## 回文子串

思路：

动态规划，中心扩展的方式

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

