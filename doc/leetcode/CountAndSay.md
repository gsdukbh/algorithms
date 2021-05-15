## 外观数列

根据提示的思路，逐级遍历。

[代码](ConutAndSay.java)

```java
public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String res = "1";
        for (int i = 2; i <= n; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            int count = 0;
            char pr = res.charAt(0);
//          双指针.
            for (int j = 1; j < res.length(); j++) {
                if (pr == res.charAt(j)) {
                    count++;
                } else {
                    stringBuffer.append(count).append(pr);
                    pr = res.charAt(j);
                    count = 1;
                }
            }
            stringBuffer.append(count).append(pr);
            res = stringBuffer.toString();
        }
        return res;
    }
```

