package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Lee JiaWei
 * @date: 2020/7/13 16:58
 */
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num :
                nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] res = new int[nums1.length];
        int index = 0;
        for (int num :
                nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                res[index++] = num;
                count--;
            }
            if (count > 0) {
                map.put(num, count);
            } else {
                map.remove(num);
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }
}
