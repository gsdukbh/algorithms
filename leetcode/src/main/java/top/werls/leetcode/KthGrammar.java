package top.werls.leetcode;

/**
 * 第K个语法符号
 *
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/7/27 15:36
 */
public class KthGrammar {
    public static void main(String[] args) {
        System.out.println(kthGrammar(63,2));
    }
    /**
     * 在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。
     * 给定行数 N 和序数 K，返回第 N 行中第 K个字符。（K从1开始）
     *
     * @param n int 行数 N
     * @param k int 序数 K
     * @return int 返回第 N 行中第 K个字符
     */
    public static int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (~k & 1) ^ kthGrammar(n - 1, (k + 1) / 2);
    }

}
