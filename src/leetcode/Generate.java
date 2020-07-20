package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

/**
 * @author : Lee JiaWei
 * @Date : 2020/7/20
 */
public class Generate {
    public static void main(String[] args) {
        List<List<Integer>> s = generate1(5);
        for (List<Integer> list : s) {
            System.err.println(Arrays.toString(list.toArray()));
        }
    }

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