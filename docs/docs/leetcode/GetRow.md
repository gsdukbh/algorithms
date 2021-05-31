## 杨辉三角 Ⅱ

[代码](../../../leetcode/app/src/main/java/top/werls/leetcode/GetRow.java)

```java

public class GetRow {
 

    public static List<Integer> getRow(int rowIndex) {
        int[][] value = new int[rowIndex + 1][rowIndex + 1];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0) {
                    value[i][j] = 1;
                } else {
                    value[i][j] = value[i - 1][j - 1] + value[i - 1][j];
                }
                if (i == rowIndex) {
                    res.add(value[i][j]);
                }
            }
        }
        return res;
    }
}
```

