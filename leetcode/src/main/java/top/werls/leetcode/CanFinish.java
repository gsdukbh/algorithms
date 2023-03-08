package top.werls.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程表,有向无环图,拓扑排序.
 * 
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020年8月4日 14点27分
 */
public class CanFinish {
    public static void main(String[] args) {
        int[][] nums = { { 0, 1 }, { 1, 2 }, { 2, 0 } };

        System.out.println(canFinish(3, nums));
    }

    /**
     * 邻接表
     */
    private static List<List<Integer>> adj;
    // 维护一个栈
    private static int[] edgeTo;
    private static boolean onStack = true;

    /**
     * 判断是否有环.
     * 
     * @param numCourses    课程数
     * @param prerequisites 边缘列表
     * @return boolean
     */
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        adj = new ArrayList<>();
        edgeTo = new int[numCourses];
        // 初始化节点
        for (int i = 0; i < numCourses; ++i) {
            adj.add(new ArrayList<>());
        }
        for (int[] is : prerequisites) {
            // 没有方向要求 ,默认 0 -> 1
            adj.get(is[0]).add(is[1]);
        }
        for (int i = 0; i < numCourses; ++i) {
            if (edgeTo[i] == 0) {
                dfs(i);
            }
        }
        return onStack;
    }

    private static void dfs(int v) {
        edgeTo[v] = 1;
        for (int i : adj.get(v)) {
            if (edgeTo[i] == 0) {
                dfs(i);
                if (!onStack) {
                    return;
                }
            } else if (edgeTo[i] == 1) {
                onStack = false;
                return;
            }
        }
        // 遍历标记
        edgeTo[v] = 2;
    }
}