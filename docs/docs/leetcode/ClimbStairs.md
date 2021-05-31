## 爬楼梯

##### 思路：递归

这个题目和斐波那契数列相似。可以用动态规划来计算。

递推方程：
$$
f(n)=f(n-1)+f(n-2)
$$
其中`n > 2`  ，

```java
 public static int climbStairs(int n) {
        if (n <= 1)
            return 1;
        if (n < 3)
            return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
```



##### 思路：迭代。

```java
 public int climbStairs(int n) {
        if(n<=1){
            return 1;
        }
        int[] res=new int[n+1];
        res[1]=1;
        res[2]=2;
        for(int i=3;i<=n;i++){
            res[i]=res[i-1]+res[i-2];
        }
        return res[n];
    }
```

思路：数学。

```java
   public int climbStairs(int n) {
        double sqrt5=Math.sqrt(5);
        double fibn=Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/2,n+1);
        return (int)(fibn/sqrt5);
    }
```

