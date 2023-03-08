package top.werls.leetcode;

import java.util.Arrays;

public class IsAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("ac", "bb"));
    }

    /**
     *
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str = s.toCharArray();
        char[] tr = t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(tr);
        return Arrays.equals(tr, str);
    }

    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
