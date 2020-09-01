#### 汉明重量

##### 思路：按位与判断

```java
   public static int hammingWeight(int n) {
        int res = 0;
        int mark = 1;
        for (int i = 0; i <= 32; i++) {
            if ((n & mark) != 0) {
                res++;
            }
            mark <<= 1;
        }
        return res;
    }
```



#### 汉明距离

```java
    public static int hammingDistance(int x, int y) {
        int tem = x ^ y;
        int res = 0;
        int mark = 1;
        for (int i = 0; i <= 32; i++) {
            if ((tem & mark) != 0) {
                res++;
            }
            mark <<= 1;
        }
        return res;
    }
```

