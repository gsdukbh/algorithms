package top.werls.leetcode;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] test = { 1, 2, 3, 4, 5 };
        rotate(test, 2);
        System.out.println(Arrays.toString(test));
    }

    /**
     * 
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        int temp, pr;
        int length = nums.length;
        for (int i = 0; i < k; i++) {
            pr = nums[length - 1];
            for (int j = 0; j < length; j++) {
                temp = nums[j];
                nums[j] = pr;
                pr = temp;
            }
        }
    }

    /**
     * 转换的后位置 (i+k)%num.length;
     * 
     * @param nums
     * @param k
     */
    public void rotate1(int[] nums, int k) {
        int length = nums.length;
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[(i + k) % length] = nums[i];
        }
        for (int i = 0; i < length; i++) {
            nums[i] = temp[i];
        }
    }

    /**
     * 环
     * 
     * @param nums
     * @param k
     */
    public void rotate2(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        int count = 0;
        for (int start = 0; count < length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

}