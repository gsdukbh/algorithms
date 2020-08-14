package leetcode;



import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/7/27 14:18
 */
public class MaxDepth {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.right = new TreeNode(1);
        treeNode.left = treeNode2;

        System.out.println(maxDepth(treeNode));
    }

    public static int maxDepth(TreeNode root) {
        if (root != null) {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
        return 0;

    }

//    public static int maxDepth1(TreeNode root) {
//        Queue<Pair<TreeNode, Integer>> stack = new LinkedList<>();
//        if (root != null) {
//            stack.add(new Pair(root, 1));
//        }
//
//        int depth = 0;
//        while (!stack.isEmpty()) {
//            Pair<TreeNode, Integer> current = stack.poll();
//            root = current.getKey();
//            int current_depth = current.getValue();
//            if (root != null) {
//                depth = Math.max(depth, current_depth);
//                stack.add(new Pair(root.left, current_depth + 1));
//                stack.add(new Pair(root.right, current_depth + 1));
//            }
//        }
//        return depth;
//    }

}
