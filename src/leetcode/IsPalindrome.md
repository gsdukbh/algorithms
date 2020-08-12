## 验证回文串

给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。



思路：排除其他字符，并把字母转成小写。

 

```java

public static boolean isPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (isTpye(s.charAt(i))) {
                stringBuffer.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return stringBuffer.toString().equals(stringBuffer.reverse().toString());
    }

    private static boolean isTpye(char a) {
        return (a >= 'a' && a <= 'z') || (a >= '0' && a <= '9') || (a >= 'A' && a <= 'Z');
    }
```

