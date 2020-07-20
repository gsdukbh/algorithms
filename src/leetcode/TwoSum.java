package leetcode;

import java.util.Arrays;

/**
 * @author lee jia wei
 * @Date
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] q = { 1, 5, 6, 8, 9, 11, 13, 14, 16, 18, 17, 19, 20 };
        System.out.println(Arrays.toString(twoSum(q, 6)));
        System.out.println(Arrays.toString(twoSum1(q, 6)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int high = numbers.length - 1, low = 0;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[] { low + 1, high + 1 };
            } else if (sum > target) {
                --high;
            } else {
                ++low;
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] twoSum1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; ++i) {
            int low = i + 1, high = numbers.length - 1;
            while (low < high) {
                int mid = (high - low) / 2 + low;
                if (target == numbers[mid] + numbers[i]) {
                    return new int[] { i + 1, mid + 1 };
                } else if (target > numbers[mid] + numbers[i]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }
        return new int[] { -1, -1 };
    }
}