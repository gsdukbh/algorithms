package leetcode;

import java.util.List;

/**
 * @author: Lee JiaWei
 * @date: 2020/7/14 11:46
 */
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
