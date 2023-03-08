package top.werls.leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * @author lee
 *
 */
public class Permute {
    public static void main(String[] args) {

    }
    /**
     * //给定一个 没有重复 数字的序列，返回其所有可能的全排列。
     * //
     * // 示例:
     * //
     * // 输入: [1,2,3]
     * //输出:
     * //[
     * //  [1,2,3],
     * //  [1,3,2],
     * //  [2,1,3],
     * //  [2,3,1],
     * //  [3,1,2],
     * //  [3,2,1]
     * //]
     * // Related Topics 回溯算法
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, nums, 0, nums.length);
        return res;
    }

    public  void dfs(List<List<Integer>> res, int[] num, int first, int last) {
        if (first == last) {
            List<Integer> temp=new ArrayList<>();
            for (Integer integer : num) {
                temp.add(integer);
            }
            res.add(temp);
        }
        for (int i = first; i < last; i++) {

            int temp = num[first];
            num[first] = num[i];
            num[i] = temp;

            dfs(res,num, first + 1, last);

            int recover = num[first];
            num[first] = num[i];
            num[i] = recover;
        }
    }
}
