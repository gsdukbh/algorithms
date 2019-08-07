package leetcode;

import java.util.ArrayList;

public class MinCostClimbingStairs {
    /**
     * 使用最小花费爬楼梯
     *
     * cost 的长度将会在 [2, 1000]。
     * 每一个 cost[i] 将会是一个Integer类型，范围为 [0, 999]。
     */
    public static int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        System.out.println(n);
        for(int i=n-3;i>=0;i--){
            cost[i]+=Math.min(cost[i+1],cost[i+2]);
        }
        return Math.min(cost[0],cost[1]);
    }

    public static void main(String[] args) {
        int [] b={3,2};
        System.out.println(minCostClimbingStairs(b));
    }
}
