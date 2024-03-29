package top.werls.leetcode;

/**
 * @author LeeJiawei
 * @Date 2020年8月5日
 */
public class MaxProfit {
    public static void main(String[] args) {
        int[] test = {12, 2, 3, 4, 5, 3, 33, 555, 666, 333, 222, 3333, 555555, 666, 3, 666, 333, 666666666, 3333, 3,
                3};
        System.out.println(maxProfit(test));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                max += prices[i] - prices[i - 1];
            }
        }
        return max;
    }

    public static int maxProfit1(int[] prices) {
        int min = Integer.MAX_VALUE, max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}