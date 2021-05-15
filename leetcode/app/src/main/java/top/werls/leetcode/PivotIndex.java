package top.werls.leetcode;

import java.util.Arrays;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/7/28 9:51
 */
public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum * 2 == sum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
