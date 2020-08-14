## 加一。

给定一个由**整数**组成的**非空**数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储**单个**数字。

代码

```java
 public static int[] plusOne(int[] digits) {
        int length = digits.length - 1;

        for (int i = length; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        int[] res = new int[length + 2];
        res[0] = 1;
        return res;
    }
```

