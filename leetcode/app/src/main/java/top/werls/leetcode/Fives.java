package top.werls.leetcode;

/**
 * @author ：lijiawei
 * @date ：Created in 2019/5/29 21:23
 * @description：最长回文子串
 * @version: 1
 */
public class Fives {

    public static void main(String[] args) {
        String s = "abacdfgdcabaaaaaaaaabaaaaaaabcccccccccbccccccccjccccccccjcccccsccccjcccccsjcscjkaskkasjdkldsjkncscljakncjksacsjkcnsadksajdwiulcnsjkgnaskljnsadkjashlcsuiahjdsakbjkcbksjnkjadnwlaucnjsklahdjklshajkdwjkankjscnajksc;alkfgjdkfjkjjjskldkkkkkkkkkospdkakddskkdsaaadskkjkljkjkljksjcksakdksdadvajdkcnlsdjkvnljkasnsjkcaskjjcjjjjjjcsaaaaaajsdjsjjjsjssjjsncjsknnnjnkckkkkkkasssscnasjcnwkansnjclaskcnjskjcnkasjncakljndlskvnjsnlvjpraorgjpiahugirhuipsiahoahug[ehugphjavkdkjfsdjfhdlkajhdkjvkjdafpoidjsfoijsfoijwlksadjfkdsjddddddkfjkjjkkkkkkkkdjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjdddddddddddddddddddddddddddddddddddddddddddsssssssssssssssssssssssssssssssssssssssssssssjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjdddkddldlllllllllllllllllllllllllllllllllllllllllllllllllllllllllvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvnnnnnnnnnnnnnnnnnnnnnnnnnnnndddddddddddddddddddddddddddddnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnjkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkssssssssssssssssssssssssssssssvdvdsvjaiocjskajkjj";
        String string = "babad";
        System.out.println(longestPalindrome(s));
        // System.out.println(longestPalindrome3(s));
        System.out.println(longestPalindrome1(s));
        System.out.println(longestPalindrome(string));
        // System.out.println(longestPalindrome3(string));
    }

    /**
     * 没有什么暴力解决不了的问题 不过太慢了
     * 
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        String k = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                temp = temp + s.charAt(j);
                // 反转字符串
                String fz = new StringBuilder(temp).reverse().toString();
                if (temp.equals(fz)) {
                    k = k.length() > temp.length() ? k : temp;
                }
            }
            temp = "";
        }
        return k;
    }

    /**
     * 动态规划
     * 
     * @param s
     * @return
     */
    public static String longestPalindrome2(String s) {
        if (s == null || s.length() < 1)
            return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    /**
     * 更新马拉车算法 参考维基百科 最长回文子串
     * 
     * @param s
     * @return
     */
    public static String longestPalindrome1(String s) {
        if (s.length() < 2) {
            return s;
        }
        char[] charArr = manacherStringString(s);
        int C = 0;
        int R = 0;
        int max = 1;
        int[] pArr = new int[charArr.length];
        int start = 0;
        for (int i = 0; i != charArr.length; i++) {
            pArr[i] = R > i ? Math.min(pArr[2 * C - i], R - i) : 1;
            int left = i - (1 + pArr[i]);
            int right = i + (1 + pArr[i]);
            // 检查边界
            while (left >= 0 && right < charArr.length && charArr[left] == charArr[right]) {
                pArr[i]++;
                left--;
                right++;

            }
            // 如果大于R, 那更新回文右边界和中心点
            if ((i + pArr[i]) > R) {
                R = i + pArr[i];
                C = i;
            }
            // 如果需要, 则更新max
            if (pArr[i] > max) {
                max = pArr[i];
                start = (i - max) / 2;
            }
        }

        return s.substring(start, start + max);
    }

    /**
     * 辅助数组
     * 
     * @param str
     * @return
     */
    public static char[] manacherStringString(String str) {
        char[] c = str.toCharArray();
        char[] res = new char[c.length * 2 + 1];
        int index = 0;
        for (int i = 0; i != res.length; i++) {
            // 两个一样效果, 填充符号"#"
            res[i] = (i % 2) == 0 ? '#' : c[index++];
            // res[i] = (i & 1) == 0 ? '#' : c[index++];
        }
        return res;
    }

}
