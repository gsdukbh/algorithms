## [120. 三角形最小路径和](https://leetcode-cn.com/problems/triangle/)

思路；

按照题目例子：

```txt
[
[2],
[3],[4],
[6],[5],[7],
[4],[1],[8],[3]
]
下一步相邻的结点。即，x+1,y ,和,x+1,y+1;
```

路径总值函数：f（x，y）=min（f（x-1,y），f（x-1,y-1））+triangle[x] [y].

这利用了贪心算法，每次选择最优的选择，可以自低向上来解决

[代码](src/leetcode/MininumTotal.java)

```java
public class MininumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        /**
         * f(x,y)=min(f(x+1,y+1),f(x+1,y)) + triangle[x][y] 自低向上
         */
        int[][] res = new int[triangle.size() + 1][triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                res[i][j] = Math.min(res[i + 1][j], res[i + 1][j + 1]) + triangle.get(i).get(j);
            }

        }
        return res[0][0];
    }
}
```

