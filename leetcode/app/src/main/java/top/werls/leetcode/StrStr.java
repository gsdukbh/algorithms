package top.werls.leetcode;

/**
 * @author lee
 */
public class StrStr {

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static int strStr1(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();
        for (int i = 0; i <= m - n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == n) {
                return i;
            }
        }
        return -1;
    }

    public static int strStr2(String haystack, String needle) {
        int m = haystack.length(), n = needle.length(), i, j;
        for (i = 0, j = 0; i < m && j < n; i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                i -= j;
                j = 0;
            }
        }
        if (j == n) {
            return i - n;
        } else {
            return -1;
        }
    }

    public static int strStr3(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length()==0){
            return -1;
        }
        int n = haystack.length(), m = needle.length(), i, j;
        int r = 256;
        int[][] dfa = new int[r][m];
        kmp(needle, dfa);
        for (i = 0, j = 0; i < n && j < m; i++) {
            j = dfa[haystack.charAt(i)][j];
        }
        if (j == m) {
            return i - m;
        } else {
            return -1;
        }
    }
    public static int strStr4(String haystack, String needle) {
        byte[] a=haystack.getBytes();
        System.out.println(a[0]);
        return haystack.indexOf(needle);
    }
    public static void kmp(String par, int[][] dfa) {
        // 模式右移一位
        dfa[par.charAt(0)][0] = 1;
        int x=0;
        for (int  j = 1; j < par.length(); j++) {
            for (int c = 0; c < dfa.length; c++) {
//               匹配失败下的值
                dfa[c][j] = dfa[c][x];
            }
//            匹配成功情况
            dfa[par.charAt(j)][j] = j + 1;
            x = dfa[par.charAt(j)][x];
        }
    }
}