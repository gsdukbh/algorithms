package leetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] test = { 9, 9, 9 };
        int[] tes = { 4, 3, 2, 1, 9 };
        System.out.println(Arrays.toString(plusOne(tes)));
        System.out.println(Arrays.toString(plusOne(test)));
    }

    public static int[] plusOne(int[] digits) {
        int length = digits.length - 1;

        for (int i = length; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        int[] res = new int[length + 2];
        res[0] = 1;
        return res;
    }
}