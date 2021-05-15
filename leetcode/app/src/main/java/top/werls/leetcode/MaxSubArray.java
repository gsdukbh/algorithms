package top.werls.leetcode;

import java.util.Arrays;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/27 16:38
 */
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int max = nums[0], tem = 0;
        for (int value :
                nums) {
            tem = Math.max(tem + value, value);
            max = Math.max(max, tem);
        }
        return max;
    }

}
