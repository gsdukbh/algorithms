package top.werls.leetcode;

import java.util.Arrays;

/**
 * @author lee
 */
public class Multiply {
    public static void main(String[] args) {
        String a = "12", b = "2";
        System.out.println(multiply1(a, b));
    }

    public static String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        String ans = "0";
        for (int i = num2.length() - 1; i >= 0; i--) {
            StringBuffer stringBuffer = new StringBuffer();
            int count = 0;
            for (int j = num2.length() - 1; j > i; j--) {
                // 补零
                stringBuffer.append(0);
            }
            int x = num2.charAt(i) - '0';
            for (int j = num1.length() - 1; j >= 0; j--) {
                int y = num1.charAt(j) - '0';
                int carry = x * y + count;
                stringBuffer.append(carry % 10);
                count = carry / 10;
            }
            if (count != 0) {
                stringBuffer.append(count % 10);
            }
            ans = AddStrings.addStrings(ans, stringBuffer.reverse().toString());
        }
        return ans;
    }

    public static String multiply1(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int[] arr = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                int y = num2.charAt(j) - '0';
                arr[i + j + 1] += x * y;
            }
        }
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i - 1] += arr[i] / 10;
            arr[i] %= 10;
        }
        StringBuffer res = new StringBuffer();
        int n = arr[0] == 0 ? 1 : 0;
        for (int i = n; i < arr.length; i++) {
            res.append(arr[i]);
        }
        return  res.toString();
    }

}