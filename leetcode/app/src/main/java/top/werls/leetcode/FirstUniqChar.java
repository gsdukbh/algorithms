package top.werls.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar1(s));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> log = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            log.put(s.charAt(i), log.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (log.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar1(String s) {
        int[][] count = new int[26][2];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'][0]++;
            count[s.charAt(i) - 'a'][1] = i;
        }
        int res = s.length();
        for (int i = 0; i < 26; i++)
            if (count[i][0] == 1 && count[i][1] < res)
                res = count[i][1];
        return (res == s.length()) ? -1 : res;

    }
}