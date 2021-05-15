package top.werls.leetcode;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/31 11:42
 */
public class CountPrimes {
    /**
     * 求出1-n的质数数量。
     * @see <a href="https://zh.wikipedia.org/wiki/%E8%B4%A8%E6%95%B0#%E8%A9%A6%E9%99%A4%E6%B3%95" >试除法 wikipedia </a>
     * @param n int
     * @return int
     */
    public static int countPrimes(int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (isPrimes(i)) {
                res++;
            }
        }

        return res;
    }

    public static boolean isPrimes(int n) {
        if (n <= 3) {
            return n > 1;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 素数筛， 筛选出素数的数目
     * @param n 1-n
     * @return count
     * @see <a href="https://zh.wikipedia.org/wiki/%E5%9F%83%E6%8B%89%E6%89%98%E6%96%AF%E7%89%B9%E5%B0%BC%E7%AD%9B%E6%B3%95">sieve of Eratosthenes 素数筛</a>
     */
    public static int countPrimes1(int n) {
        int res = 0, sqrtN = (int) Math.sqrt(n);
        boolean[] b = new boolean[n];
        // 初始化默认值都为 false，为质数标记
        if (2 < n) {
            res++;
        }
        // 如果大于 2 则一定拥有 2 这个质数
        for (int i = 3; i < n; i += 2) {
            // 从 3 开始遍历，且只遍历奇数
            if (!b[i]) {
                // 是质数
                if (i <= sqrtN)
                //不大于根号n
                {
                    for (int j = i; i * j < n; j += 2) {
                        b[i * j] = true;
                    }
                }
                // 将当前质数的奇数倍都设置成非质数标记 true
                res++;
                // 质数个数 +1
            }
        }
        return res;
    }

}
