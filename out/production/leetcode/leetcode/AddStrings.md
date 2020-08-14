## 字符串相加

给定两个字符串形式的非负整数 `num1` 和`num2` ，计算它们的和。

#### 思路：

可以从低位的数字进行加法运算。并使用竖式运算的进位方式。

[代码](AddString.java)

```java
public static String addStrings(String num1, String num2) {
        StringBuffer stringBuffer = new StringBuffer();
        int n = num1.length() - 1, m = num2.length() - 1, carry = 0;
        while (carry != 0 || n >= 0 || m >= 0) {
            if (n >= 0) {
                // 复位
                carry += num1.charAt(n--) - '0';
            }
            if (m >= 0) {
                carry += num2.charAt(m--) - '0';
            }
            stringBuffer.append(carry % 10);
            carry /= 10;
        }
    	
        return stringBuffer.reverse().toString();
    }
```





