package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/21 16:33
 */
class SortedArrayToBinarySearchTreeTest {

    @Test
    void sortedArrayToBinarySearchTree() {
        int[] test = {-10, -3, 0, 5, 9};
        TreeNode s = SortedArrayToBinarySearchTree.sortedArrayToBinarySearchTree(test);
        List<Integer> list = s.Preorder(s);
        System.out.println(list);
    }
}