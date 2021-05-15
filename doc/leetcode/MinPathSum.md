## 64.最小路径和

给定一个包含非负整数的 *m* x *n* 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。

**说明：**每次只能向下或者向右移动一步。

### 思路 ：

若当前所在位置为`(i,j)` 时，下一步只能为`(i+1,j)` 和`(i,j+1)` 。

这个考虑到矩阵边界的问题有三种情况。

1. 当前位置的第一行时是矩阵上边界 即 `i=0` ：这个时候只能从左边来 `res[i][j]= res[i][j-1] + grid[i][j]`
2. 当前位置为第一列时，即`j=0`。只能从上方来。`res[i][j]= res[i-1][j] + grid[i][j]` 
3. 当前位置时起始位置。即`j=0,i=0`  ,`res[i][j]=grid[i][j]`
4. 其他位置,即`j ≠0，i≠0` ,`res[i][j]= Min(res[i][j-1],res[i-1][j] ) + grid[i][j]` 

 

[代码](../../leetcode/app/src/main/java/top/werls/leetcode/MinPathSum.java)

```java
public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int row = grid.length, column = grid[0].length;
        int[][] res = new int[row][column];
        // res = grid;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 && j == 0) {
                    // 起点
                    res[i][j] = grid[i][j];
                } else if (i == 0) {
                    // 在第一行,只能从左边来
                    res[i][j] = res[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    // 在第一列 只能从上方来
                    res[i][j] = res[i - 1][j] + grid[i][j];
                } else {
                    res[i][j] = Math.min(res[i - 1][j], res[i][j - 1]) + grid[i][j];
                }
            }
        }
        // 最后一个为解
        return res[row - 1][column - 1];
    }
```





