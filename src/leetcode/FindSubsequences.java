package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/25 10:07
 */
public class FindSubsequences {
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> tem = new ArrayList<>();

    public static List<List<Integer>> findSubsequences(int[] nums) {
        dfs(0, Integer.MIN_VALUE, nums);
        return res;
    }

    public static void dfs(int count, int value, int[] nums) {
        if (count == nums.length) {
            if (tem.size() >= 2) {
                res.add(new ArrayList<>(tem));
            }
            return;
        }
        if (nums[count] >= value) {
            tem.add(nums[count]);
//            加
            dfs(count + 1, nums[count], nums);
//            去
            tem.remove(tem.size() - 1);
        }
//去重
        if (nums[count] != value) {
            dfs(count + 1, value, nums);
        }
    }
}
