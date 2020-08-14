## 杨辉三角

思路：

> 从帕斯卡三角形内的递推关系开始。
>
> 首先，我们定义一个函数 f(i, j)*f*(*i*,*j*)，它将会返回帕斯卡三角形`第 i 行`、`第 j 列`的数字。
>
> 我们可以用下面的公式来表示这一递推关系：
>
> f(i, j) = f(i - 1, j - 1) + f(i - 1, j)
>
> 然后有
>
> *f*(*i*,*j*)=1
>
> *w**h**e**r**e j*=1*o**r**j*=*i*

[代码](Generate.java)

```java

public class Generate {
    /**
     * f(i,j)=f(i−1,j−1)+f(i−1,j)
     * 
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }
        if (numRows == 1) {
            res.add(new ArrayList<>());
            res.get(0).add(1);
            return res;
        }

        res = generate(numRows - 1);
        List<Integer> last = new ArrayList<>();
        last.add(1);
        for (int i = 1; i < numRows - 1; i++) {
            last.add(res.get(numRows - 2).get(i - 1) + res.get(numRows - 2).get(i));
        }
        last.add(1);
        res.add(last);
        return res;
    }

    public static List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int[][] value = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            List<Integer> last = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0) {
                    value[i][j] = 1;
                } else {
                    value[i][j] = value[i - 1][j - 1] + value[i - 1][j];
                }
                last.add(value[i][j]);
            }
            res.add(last);
        }
        return res;
    }
}
```

