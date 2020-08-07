package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] test = { 1, 2, 3 };
        System.out.println(containsDuplicate(test));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for (int i : nums) {
            if (map.contains(i)) {
                return true;
            } else {
                map.add(i);
            }
        }
        return false;
    }

    public static boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}