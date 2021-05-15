package top.werls.leetcode;

public class CountBinarySubstrings {

    public static void main(String[] args) {
        String adm = "00110011";
        System.out.println(countBinarySubstrings(adm));
    }

    /**
     * 连续子串相同的1和0的数量.
     * 
     * @param s String
     * @return int
     */
    public static int countBinarySubstrings(String s) {
        int ptr = 0, n = s.length(), last = 0, ans = 0;
        while (ptr < n) {
            char c = s.charAt(ptr);
            int count = 0;
            while (ptr < n && s.charAt(ptr) == c) {
                ++ptr;
                ++count;
            }
            ans += Math.min(count, last);
            last = count;
        }
        return ans;
    }
}