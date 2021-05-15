package top.werls.leetcode;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/31 15:22
 */
public class HammingWeight {
    public static int hammingWeight(int n) {
        int res = 0;
        int mark = 1;
        for (int i = 0; i <= 32; i++) {
            if ((n & mark) != 0) {
                res++;
            }
            mark <<= 1;
        }
        return res;
    }

    public static int hammingDistance(int x, int y) {
        int tem = x ^ y;
        int res = 0;
        int mark = 1;
        for (int i = 0; i <= 32; i++) {
            if ((tem & mark) != 0) {
                res++;
            }
            mark <<= 1;
        }
        return res;
    }
}
