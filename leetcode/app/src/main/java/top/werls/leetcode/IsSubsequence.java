package top.werls.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lee jiawei
 */
public class IsSubsequence {

    /**
     * @param s String
     * @param t String
     * @return boolean
     */
    public boolean isSubsequence(String s, String t) {
        int sl = s.length(), tl = t.length();
        int i = 0, j = 0;
        while (i < sl && j < tl) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == sl;
    }

    public boolean isSubsequenceDp(String s, String t) {
        int sl = s.length(), tl = t.length();
        int[][] strin = new int[tl + 1][26];
        // 初始化
        for (int i = 0; i < 26; i++) {
            strin[tl][i] = tl;
        }
        for (int i = tl - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (t.charAt(i) == j + 'a') {
                    strin[i][j] = i;
                } else {
                    strin[i][j] = strin[i + 1][j];
                }
            }
        }
        int address = 0;
        for (int i = 0; i < sl; i++) {
            if (strin[address][s.charAt(i) - 'a'] == tl) {
                return false;
            }
            address = strin[address][s.charAt(i) - 'a'] + 1;
        }
        return true;
    }

}