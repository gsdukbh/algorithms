package top.werls.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 连续数组
 *
 * @author leejiawei
 */
public class ContiguousArray {

    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> h = new HashMap<>();
        int max = 0;
        int sum = 0;
        h.put(sum, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                sum++;
            } else {
                sum--;
            }
            if (h.containsKey(sum)) {
                max = Math.max(max, i - h.get(sum));
            } else {
                h.put(sum, i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{0, 1, 1, 1, 0, 0, 0}));
    }
}
