package top.werls.leetcode;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/24 14:36
 */
public class RrepeatedSubstringPattern {
    /**
     * 枚举
     *
     * @param s
     * @return
     */
    public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for (int i = 1; i * 2 <= length; i++) {
            if (length % i == 0) {
                boolean m = true;
//                子串长度
                for (int j = i; j < length; j++) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        m = false;
                        break;
                    }
                }
                if (m) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 字符匹配 , 现 S=ns ,S+S=2ns ,则,S+S[1,2n] 中有S。
     *
     * @param s
     * @return
     */
    public static boolean repeatedSubstringPattern1(String s) {
        String s2 = s + s;
//        return  s2.substring(1).matches(".*"+s);
        return s2.indexOf(s, 1) != s.length();
    }
}
