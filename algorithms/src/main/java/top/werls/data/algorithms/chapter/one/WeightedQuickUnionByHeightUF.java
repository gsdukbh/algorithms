package top.werls.data.algorithms.chapter.one;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/25 15:58
 */
public class WeightedQuickUnionByHeightUF {
    private int[] parent;
    private int[] height;
    private int count;

    public WeightedQuickUnionByHeightUF(int n) {
        count = n;
        parent = new int[n];
        height = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            height[i] = 0;
        }
    }

    public int count() {
        return count;
    }

    public int find(int p) {
        validate(p);
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }

    private void validate(int p) {
        int n = parent.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n - 1));
        }
    }

    @Deprecated
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        int i = find(p), j = find(q);
        if (i == j) {
            return;
        }
        if (height[i] < height[j]) {
            parent[i] = j;
        } else if (height[i] > height[j]) {
            parent[j] = i;
        }else {
            parent[j]=i;
            height[i]++;
        }
        count--;
    }
}
