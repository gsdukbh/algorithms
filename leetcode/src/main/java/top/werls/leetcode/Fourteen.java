package top.werls.leetcode;

public class Fourteen {
    /**
     * 最长公共前缀 编写一个函数来查找字符串数组中的最长公共前缀。 如果不存在公共前缀，返回空字符串 ""
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String p = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(p) != 0) {
                // 匹配是否有公共头部
                p = p.substring(0, p.length() - 1);
                if (p.isEmpty()) {
                    return "";
                }
            }
        }
        return p;
    }
}
