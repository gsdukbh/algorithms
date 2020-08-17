### 实现 strStr()

匹配字符串，返回改字符串在文中第一次出现的位置。

##### 思路一：暴力匹配

```java
public static int strStr(String haystack, String needle) {
        int m = haystack.length(), n = needle.length(), i, j;
        for (i = 0, j = 0; i < m && j < n; i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                i -= j;
                j = 0;
            }
        }
        if (j == n) {
            return i - n;
        } else {
            return -1;
        }
    }
```

`Java`中`String.indexOf`方法也是用暴力匹配实现的.

java 中的实现

```java
public static int indexOf(byte[] value, int valueCount, byte[] str, int strCount, int fromIndex) {
        byte first = str[0];
        int max = (valueCount - strCount);
        for (int i = fromIndex; i <= max; i++) {
            // Look for first character.
            if (value[i] != first) {
                while (++i <= max && value[i] != first);
            }
            // Found first character, now look at the rest of value
            if (i <= max) {
                int j = i + 1;
                int end = j + strCount - 1;
                for (int k = 1; j < end && value[j] == str[k]; j++, k++);
                if (j == end) {
                    // Found whole string.
                    return i;
                }
            }
        }
        return -1;
    }
```



##### 滑动窗口,暴力匹配

```java
public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
```



##### KMP .

和暴力匹配相似.

```java
 public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length()==0){
            return -1;
        }
        int n = haystack.length(), m = needle.length(), i, j;
        int r = 256;
        int[][] dfa = new int[r][m];
        kmp(needle, dfa);
        for (i = 0, j = 0; i < n && j < m; i++) {
            j = dfa[haystack.charAt(i)][j];
        }
        if (j == m) {
            return i - m;
        } else {
            return -1;
        }
    }
    public static void kmp(String par, int[][] dfa) {
        // 模式右移一位
        dfa[par.charAt(0)][0] = 1;
        int x=0;
        for (int  j = 1; j < par.length(); j++) {
            for (int c = 0; c < dfa.length; c++) {
//               匹配失败下的值
                dfa[c][j] = dfa[c][x];
            }
//            匹配成功情况
            dfa[par.charAt(j)][j] = j + 1;
            x = dfa[par.charAt(j)][x];
        }
    }
```



