## 数值字串

判断一个字串是否是数值。



##### 正则

```java
 public boolean isNumber(String s) {
        return s.trim().matches("^[+-]?((\\d*\\.?\\d+)|(\\d+\\.?\\d*))([eE][+-]?\\d+)?$");
    }
```



##### 暴力

```java
 public boolean isNumber1(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        s = s.trim();
        boolean num = false;
        boolean point = false;
        boolean e = false;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num = true;

            } else if (s.charAt(i) == '.' && !point && !e) {
                point = true;

            } else if ((s.charAt(i) == 'e' || s.charAt(i) == 'E') && !e && num) {
                e = true;
                num = false;

            } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (i == 0 || s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E') {

                }
            } else {
                return false;
            }
        }
        return num;
    }
```

