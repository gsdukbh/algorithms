package top.werls.leetcode;

import static leetcode.Fives.manacherStringString;

/**
 * 回文子串
 *
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/19 9:13
 */
public class CountSubstrings {

    public static int countSubstrings(String s) {
        int length = s.length(), res = 0;
        for (int i = 0; i < 2 * length - 1; i++) {
            int L = i / 2, R = i / 2 + i % 2;
            while (L >= 0 && R < length && s.charAt(L) == s.charAt(R)) {
                L--;
                R++;
                res++;
            }
        }
        return res;
    }

    public static int countSubstringsMana(String s) {
        int n = s.length();
        StringBuffer t = new StringBuffer("$#");
        for (int i = 0; i < n; ++i) {
            t.append(s.charAt(i));
            t.append('#');
        }
        n = t.length();
        t.append('!');

        int[] f = new int[n];
        int iMax = 0, rMax = 0, ans = 0;
        for (int i = 1; i < n; ++i) {
            // 初始化 f[i]
            f[i] = i <= rMax ? Math.min(rMax - i + 1, f[2 * iMax - i]) : 1;
            // 中心拓展
            while (t.charAt(i + f[i]) == t.charAt(i - f[i])) {
                ++f[i];
            }
            // 动态维护 iMax 和 rMax
            if (i + f[i] - 1 > rMax) {
                iMax = i;
                rMax = i + f[i] - 1;
            }
            // 统计答案, 当前贡献为 (f[i] - 1) / 2 上取整
            ans += f[i] / 2;
        }

        return ans;
    }

}
