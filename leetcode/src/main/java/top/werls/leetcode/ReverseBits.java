package top.werls.leetcode;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/31 16:42
 */
public class ReverseBits {
    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i <= 31; i++) {
            res ^= (n & (1 << i)) != 0 ? 1 << (31 - i) : 0;
        }
        return res;
    }
}
