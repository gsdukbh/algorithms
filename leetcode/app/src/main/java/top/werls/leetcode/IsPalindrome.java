package top.werls.leetcode;

public class IsPalindrome {
    public static void main(String[] args) {
        String string = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(string));
    }

    public static boolean isPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (isTpye(s.charAt(i))) {
                stringBuffer.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return stringBuffer.toString().equals(stringBuffer.reverse().toString());
    }

    private static boolean isTpye(char a) {
        return (a >= 'a' && a <= 'z') || (a >= '0' && a <= '9') || (a >= 'A' && a <= 'Z');
    }
}