package top.werls.leetcode;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        if (nums == null || nums.length == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tem = nums[i];
                nums[i] = nums[j];
                nums[j++] = tem;
            }
        }
    }
}