package top.werls.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Lee JiaWei
 * @Date : 2020/7/20
 */
public class GetRow {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

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