package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/26 10:23
 */
public class LetterCombinations {
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        Map<Character, String> map = Map.of(
                '2', "abc",
                '3', "def",
                '4', "ghi",
                '5', "jkl",
                '6', "mno",
                '7', "pqrs",
                '8', "tuv",
                '9', "wxyz"
        );
        backtrack(map, digits, res, new StringBuffer(), 0);
        return res;
    }

    private static void backtrack(Map<Character, String> map, String d, List<String> res, StringBuffer buffer, int index) {
        if (index == d.length()) {
            res.add(buffer.toString());
        } else {
            for (int i = 0; i < map.get(d.charAt(index)).length(); i++) {
                buffer.append(map.get(d.charAt(index)).charAt(i));
                backtrack(map, d, res, buffer, index + 1);
                buffer.deleteCharAt(index);
            }
        }
    }
}
