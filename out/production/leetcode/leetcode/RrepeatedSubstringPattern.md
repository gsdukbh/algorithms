## 重复的字符串

判断一个字符是否有重复的字串构成。

#####  思路 ： 暴力

假设字符`S`由`n`个`s`长度`l`构成，则必然有 `S[i]=S[i+l-1]` 

```java
public  static boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for (int i = 1; i * 2 <= length; i++) {
            if (length % i == 0) {
                boolean m = true;
//                子串长度
                for (int j = i; j < length; j++) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        m = false;
                        break;
                    }
                }
                if (m) {
                    return true;
                }
            }
        }
        return false;
    }
```



##### 思路：字符串匹配

