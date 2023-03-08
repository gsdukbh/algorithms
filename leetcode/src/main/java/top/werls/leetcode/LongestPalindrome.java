package top.werls.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 409
 * @author : LiJiWei
 * @version V1.0
 * @Project: leetcode
 * @Package leetcode
 * @Description: TODO
 * @date Date : 2020年03月19日 15:27
 */
public class LongestPalindrome {
    /* 最长回文串 构造最长回文串*/
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    public static int longestPalindrome(String s) {
        Map<Character, Integer> re = new HashMap<>(58);
        for (char c : s.toCharArray()) {
            re.put(c, re.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for (Character key : re.keySet()) {
            int val = re.get(key);
            res += val / 2 * 2;
            if (val % 2 == 1 && res % 2 == 0) {
                res++;
            }
        }
        return res;
    }
}