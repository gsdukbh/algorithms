package leetcode;

/**
 * @author lee jiawei
 */
public class AddStrings {
    public static void main(String[] args) {
        String nString = "12", mString = "156";
        System.out.println(addStrings(nString, mString));
    }

    public static String addStrings(String num1, String num2) {
        StringBuffer stringBuffer = new StringBuffer();
        int n = num1.length() - 1, m = num2.length() - 1, carry = 0;
        while (carry != 0 || n >= 0 || m >= 0) {
            if (n >= 0) {
                // 复位
                carry += num1.charAt(n--) - '0';
            }
            if (m >= 0) {
                carry += num2.charAt(m--) - '0';
            }
            stringBuffer.append(carry % 10);
            carry /= 10;
        }
        // 反转
        return stringBuffer.reverse().toString();
    }
}