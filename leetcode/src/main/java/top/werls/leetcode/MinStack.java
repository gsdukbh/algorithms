package top.werls.leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/28 15:20
 */
public class MinStack {
    private int[][] array = new int[1][2];
    private int count = 1;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        array[0][1] = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (count == array.length) {
            resize(array.length * 2 + 1);
        }
        array[count][1] = Math.min(x, array[count - 1][1]);
        array[count++][0] = x;
    }

    public void pop() {
        count--;
//        6 最佳， 4 报错
        if (count > 0 && count == array.length / 6) {
            resize(array.length / 3);
        }
    }

    public int top() {
        return array[count - 1][0];
    }

    public int getMin() {
        return array[count - 1][1];
    }

    private void resize(int max) {
        int[][] tem = new int[max][2];
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array[i], 0, tem[i], 0, 2);
        }
        array = tem;
    }
}
