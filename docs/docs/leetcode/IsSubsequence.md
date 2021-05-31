## 392. 判断子序列

思路1.暴力遍历。

[代码](../../../leetcode/app/src/main/java/top/werls/leetcode/IsSubsequence.java)

```java
public boolean isSubsequence(String s, String t) {
        int sl = s.length(), tl = t.length();
        int i = 0, j = 0;
        while (i < sl && j < tl) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == sl;
    }
```



思路  2. dp

记录t 字符串中字符第一次出现的位置，然后