## 计数二进制子串

连续子字串相同1，0的数量。

[代码](../../leetcode/app/src/main/java/top/werls/leetcode/CountBinarySubstrings.java)

```java
public static int countBinarySubstrings(String s) {
        int ptr = 0, n = s.length(), last = 0, ans = 0;
        while (ptr < n) {
            char c = s.charAt(ptr);
            int count = 0;
            while (ptr < n && s.charAt(ptr) == c) {
                ++ptr;
                ++count;
            }
            ans += Math.min(count, last);
            last = count;
        }
        return ans;
    }
```

