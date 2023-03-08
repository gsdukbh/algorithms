package top.werls.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ：lijiawei
 * @date ：Created in 2019/05/2019/5/26 13:43
 * @description：无重复字符的最长子串
 * @version: 1
 */
public class Three {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s3));
        System.out.println(lengthOfLongestSubstring2(s3));
        System.out.println(lengthOfLongestSubstring3(s3));
    }

    /* 暴力法 */
    private static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ret = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (allUnique(s, i, j)) {
                    ret = Math.max(ret, j - i);
                }
            }
        }
        return ret;
    }

    private static boolean allUnique(String s, int start, int end) {
        Set<Character> characters = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character character = s.charAt(i);
            if (characters.contains(character)) {
                return false;
            }
            characters.add(character);
        }
        return true;
    }

    private static int lengthOfLongestSubstring2(String s) {
        int length = s.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        /**
         * HashMap containsKey(Object key) 如果此映射包含对于指定键的映射关系，则返回 true
         */
        for (int i = 0, j = 0; j < length; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }

        return ans;
    }

    private static int lengthOfLongestSubstring3(String s) {
        Set<Character> characters = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            /**
             * contains(Object o) 如果此 set 包含指定元素，则返回 true。
             */
            if (!characters.contains(s.charAt(j))) {
                characters.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                characters.remove(s.charAt(i++));
            }
        }

        return ans;
    }

}
