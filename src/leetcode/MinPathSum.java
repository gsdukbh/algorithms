package leetcode;

public class MinPathSum {
    public static void main(String[] args) {
        int[][] a = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
        System.out.println(minPathSum(a));
    }

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
}