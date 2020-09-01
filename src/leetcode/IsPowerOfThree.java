package leetcode;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/31 14:45
 */
public class IsPowerOfThree {
    /**
     * 迭代判读是否是3的幂。
     *
     * @param n int
     * @return Boolean
     */
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    /**
     * 对数恒等式，判断，
     *
     * @param n int
     * @return Boolean
     * @see <a href="https://zh.wikipedia.org/wiki/%E5%AF%B9%E6%95%B0%E6%81%92%E7%AD%89%E5%BC%8F" >对数恒等式 Wiki</a>
     */
    public boolean isPowerOfThree1(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
