package top.werls.leetcode;

public class IsValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] box = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int curNum = board[i][j] - '1';
                    if (row[i][curNum] == 1) {
                        return false;
                    }
                    if (col[j][curNum] == 1) {
                        return false;
                    }
                    if (box[j / 3 + (i / 3) * 3][curNum] == 1) {
                        return false;
                    }
                    row[i][curNum] = 1;
                    col[j][curNum] = 1;
                    box[j / 3 + (i / 3) * 3][curNum] = 1;
                }
            }
        }
        return true;
    }
}