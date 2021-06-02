package top.werls.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leejiawei
 */
public class CheckSubarraySum {
    public static boolean method(int[] nums, int k) {
        if (nums.length < 2) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                count++;
                if ((count >= 2 && (sum % k) == 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hashMethod(int[] nums, int k) {
        int m = nums.length;
        if (m < 2) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>(16);
        map.put(0, -1);
        int remainder = 0;
        for (int i = 0; i < m; i++) {
            remainder = (remainder + nums[i]) % k;
            if (map.containsKey(remainder)) {
                int prevIndex = map.get(remainder);
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] ints = {2, 7,4,3};
//        System.out.println(method(ints, 2));
        System.out.println(hashMethod(ints,6));
    }
}
