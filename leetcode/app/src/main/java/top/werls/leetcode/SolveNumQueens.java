package top.werls.leetcode;

import java.util.*;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/9/3 11:46
 */
public class SolveNumQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        Set<Integer> columns = new HashSet<>();
        Set<Integer> dx = new HashSet<>();
        Set<Integer> dl = new HashSet<>();
        backtrack(ans, queens, n, 0, columns, dx, dl);
        return ans;
    }

    private void backtrack(List<List<String>> ans, int[] queens, int n, int row, Set<Integer> columns, Set<Integer> dx,
            Set<Integer> dl) {
        if (row == n) {
            List<String> list = getRow(queens, n);
            ans.add(list);
        } else {
            for (int i = 0; i < n; i++) {
                if (columns.contains(i)) {
                    continue;
                }
                int diagonal1 = row - i;
                if (dx.contains(diagonal1)) {
                    continue;
                }
                int diagonal2 = row + i;
                if (dl.contains(diagonal2)) {
                    continue;
                }
                queens[row] = i;
                columns.add(i);
                dx.add(diagonal1);
                dl.add(diagonal2);
                backtrack(ans, queens, n, row + 1, columns, dx, dl);
                queens[row] = -1;
                columns.remove(i);
                dx.remove(diagonal1);
                dl.remove(diagonal2);

            }
        }
    }

    private List<String> getRow(int[] queens, int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[queens[i]] = 'Q';
            list.add(new String(row));
        }
        return list;
    }
}
