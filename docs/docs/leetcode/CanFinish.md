## 课程表

思路：

根据题目描述，可以知道，实际上是在找有无环。课程选修是`拓扑排序·`经典问题。

> 参考《Algorithms》第四版 P.371 上的算法

[代码](../../../leetcode/app/src/main/java/top/werls/leetcode/CanFinish.java)

```java
   private static List<List<Integer>> adj;
    // 维护一个栈
    private static int[] edgeTo;
    private static boolean onStack = true;
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
```

