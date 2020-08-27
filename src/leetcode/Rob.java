package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Rob {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node3 = new TreeNode(3);
        TreeNode node5 = new TreeNode(1);
        node4.right = node5;
        node2.right = node3;
        node.left = node2;
        node.right = node4;
        System.out.println(rob2(node));
    }

    public static int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int money = root.val;
        if (root.left != null) {
            money += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            money += rob(root.right.left) + rob(root.right.right);
        }

        return Math.max(money, rob(root.left) + rob(root.right));
    }

    static Map<TreeNode, Integer> memory = new HashMap<>();

    public static int rob1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (memory.containsKey(root)) {
            return memory.get(root);
        }
        int money = root.val;
        if (root.left != null) {
            money += rob1(root.left.left) + rob1(root.left.right);
        }
        if (root.right != null) {
            money += rob1(root.right.left) + rob1(root.right.right);
        }
        int res = Math.max(money, rob1(root.left) + rob1(root.right));
        memory.put(root, res);
        return res;
    }

    public static int rob2(TreeNode root) {
        int[] rootStatus = dfs(root);
        return Math.max(rootStatus[0], rootStatus[1]);
    }

    public static int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int is = root.val + left[1] + right[1];
        int not = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return new int[]{is, not};
    }

    /**
     * 打家劫舍 Ⅰ
     *
     * @param nums
     * @return
     */
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i - 2] + dp[i]);
        }
        return dp[nums.length - 1];
    }

    public static int rob1(int[] nums) {
        int first = 0;
        int second = 0;
        for (int i : nums) {
            int temp = second;
            second = Math.max(second, first + i);
            first = temp;
        }
        return second;
    }

}