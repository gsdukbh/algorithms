package top.werls.leetcode;

import java.util.HashMap;

/**
 * 给你一个正整数数组 nums，请你移除 最短 子数组（可以为 空），使得剩余元素的 和 能被 p 整除。 不允许 将整个数组都移除。
 * <p>
 * 请你返回你需要移除的最短子数组的长度，如果无法满足题目要求，返回 -1 。
 * <p>
 * 子数组 定义为原数组中连续的一组元素。
 * <p>
 * 来源：力扣（LeetCode） 链接：https://leetcode.cn/problems/make-sum-divisible-by-p
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Li JiaWei
 * @version TODO
 * @date 2023/3/10
 * @since on
 */
public class MinSubarray_1590 {

  /**
   * 给你一个正整数数组nums，请你移除 最短子数组（可以为 空），使得剩余元素的 和 能被 p 整除。 不允许 将整个数组都移除。
   * <p>
   * 请你返回你需要移除的最短子数组的长度，如果无法满足题目要求，返回 -1。
   *
   * <p>子数组</p> 定义为原数组中连续的一组元素。
   * <p>
   * 输入：nums = [3,1,4,2], p = 6 输出：1 解释：nums 中元素和为 10，不能被 p 整除。我们可以移除子数组 [4] ，剩余元素的和为 6 。
   * <p>
   * 输入：nums = [6,3,5,2], p = 9 输出：2 解释：我们无法移除任何一个元素使得和被 9 整除，最优方案是移除子数组 [5,2] ，剩余元素为 [6,3]，和为 9 。
   * <p>
   * 输入：nums = [1,2,3], p = 3 输出：0 解释：和恰好为 6 ，已经能被 3 整除了。所以我们不需要移除任何元素。
   * <p>
   * 输入：nums = [1,2,3], p = 7 输出：-1 解释：没有任何方案使得移除子数组后剩余元素的和被 7 整除。
   * <p>
   * 输入：nums = [1000000000,1000000000,1000000000], p = 3 输出：0
   *
   * @param nums
   * @param p
   * @return
   */
  public static int minSubarray(int[] nums, int p) {
    // 处理后的 数组是 连续的
    // 没有整除 返回 -1
    // 连续和被整除。
    //
    int a = 0;
    for (int i : nums) {
      a = (a + i) % p;
    }
    if (a == 0) {
      return 0;
    }
    // 前缀和 + hash 表
    // tip1
    HashMap<Integer, Integer> index = new HashMap<>();
    int x = 0, max = nums.length;
    // tip2 tip3
    for (int i = 0; i < nums.length; i++) {
      index.put(x, i);
      x = (x + nums[i]) % p;
      var temp = (x - a + p) % p;
      if (index.containsKey(temp)) {
        max = Math.min(max, i - index.get(temp) + 1);
      }
    }
    if (max == nums.length) {
      return -1;
    } else {
      return max;
    }
  }

  public static void main(String[] args) {
    int[] nums = {3, 1, 4, 2};
    System.out.println(minSubarray(nums, 3));
  }

}
