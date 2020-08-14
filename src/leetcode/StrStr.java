package leetcode;

/**
 * @author lee
 */
public class StrStr {
    public static void main(String[] args) {
        String hString = "a", nString = "ak";
        System.out.println(strStr(hString, nString));
    }

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


        return -1;
    }
}