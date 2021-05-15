## 最长回文字串

##### 思路一：

遍历匹配方法。

[代码](../../leetcode/app/src/main/java/top/werls/leetcode/Fives.java)

```java
public static String longestPalindrome(String s) {
        String k = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                temp = temp + s.charAt(j);
                // 反转字符串
                String fz = new StringBuilder(temp).reverse().toString();
                if (temp.equals(fz)) {
                    k = k.length() > temp.length() ? k : temp;
                }
            }
            temp = "";
        }
        return k;
    }
```





##### 思路二；

动态规划，当前字符位置为`i` ,那么子问题为，当`i - 1 = i + 1 ` 说明是回文，则接着向两边探测。记录下最大的两边扩展值。

代码：

```java
 public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
```



##### 思路三：

[Manacher](https://zh.wikipedia.org/wiki/%E6%9C%80%E9%95%BF%E5%9B%9E%E6%96%87%E5%AD%90%E4%B8%B2#Manacher%E7%AE%97%E6%B3%95)算法。在字符串里插入相隔插入一个字符`#` ，在利用动态规划的方法求最大回文串。

```java
    public static String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        char[] charArr = manacherStringString(s);
        int C = 0;
        int R = 0;
        int max = 1;
        int[] pArr = new int[charArr.length];
        int start = 0;
        for (int i = 0; i != charArr.length; i++) {
            pArr[i] = R > i ? Math.min(pArr[2 * C - i], R - i) : 1;
            int left = i - (1 + pArr[i]);
            int right = i + (1 + pArr[i]);
            // 检查边界
            while (left >= 0 && right < charArr.length && charArr[left] == charArr[right]) {
                pArr[i]++;
                left--;
                right++;

            }
            // 如果大于R, 那更新回文右边界和中心点
            if ((i + pArr[i]) > R) {
                R = i + pArr[i];
                C = i;
            }
            // 如果需要, 则更新max
            if (pArr[i] > max) {
                max = pArr[i];
                start = (i - max) / 2;
            }
        }

        return s.substring(start, start + max);
    }

    /**
     * 辅助数组
     * 
     * @param str
     * @return
     */
    public static char[] manacherStringString(String str) {
        char[] c = str.toCharArray();
        char[] res = new char[c.length * 2 + 1];
        int index = 0;
        for (int i = 0; i != res.length; i++) {
            // 两个一样效果, 填充符号"#"
            res[i] = (i % 2) == 0 ? '#' : c[index++];
            // res[i] = (i & 1) == 0 ? '#' : c[index++];
        }
        return res;
    }
```



