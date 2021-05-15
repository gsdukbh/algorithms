package top.werls.leetcode;

import java.util.Random;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/28 14:26
 */
public class UpsetArray {
    private int[] array;
    private int[] tem;

    public UpsetArray(int[] nums) {
        this.array = nums;
        this.tem = nums.clone();
    }

    /**
     * Resets the array to its original configuration and return it.
     * 把数组还原.
     */
    public int[] reset() {
        array = tem;
        tem = tem.clone();
        return array;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            swap(i,random(i,array.length));
        }
        return array;
    }

    private void swap(int a, int b) {
        int tem = array[a];
        array[a] = array[b];
        array[b] = tem;
    }

    private int random(int start, int end) {
        Random random = new Random();
        return random.nextInt(end - start) + start;
    }
}
