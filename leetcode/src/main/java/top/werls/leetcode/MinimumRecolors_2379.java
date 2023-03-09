package top.werls.leetcode;

/**
 * 给你一个长度为 n下标从 0开始的字符串blocks，blocks[i]要么是'W'要么是'B'，表示第i块的颜色。字符'W' 和'B'分别表示白色和黑色。
 * <p>
 * 给你一个整数k，表示想要连续黑色块的数目。 每一次操作中，你可以选择一个白色块将它 涂成黑色块。 请你返回至少出现 一次连续 k个黑色块的 最少操作次数。 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Li JiaWei
 * @version TODO
 * @date 2023/3/9
 * @since on
 */
public class MinimumRecolors_2379 {

  /**
   * 给你一个长度为 n下标从 0开始的字符串blocks，blocks[i]要么是'W'要么是'B'，表示第i块的颜色。字符'W' 和'B'分别表示白色和黑色。
   * <p>
   * 给你一个整数k，表示想要连续黑色块的数目。 每一次操作中，你可以选择一个白色块将它 涂成黑色块。 请你返回至少出现 一次连续 k个黑色块的 最少操作次数。 来源：力扣（LeetCode）
   * 链接：https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks
   * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
   *
   * @param blocks
   * @param k
   * @return
   * @author Li JiaWei
   */
  public static int minimumRecolors(String blocks, int k) {
    // 这个是一个滑动窗口问题，
    // 返回一个k 少操作次数的
    int a = 0, b = 0, c = 0;
    while (a < k) {
      // 前几个次数
      c += blocks.charAt(a) == 'W' ? 1 : 0;
      a++;
    }
    int as = c;
    while (a < blocks.length()) {
      // 右
      c += blocks.charAt(a) == 'W' ? 1 : 0;
      //左
      c -= blocks.charAt(b) == 'W' ? 1 : 0;
      b++;
      a++;
      as = Math.min(as, c);
    }
    return as;
  }

  public static void main(String[] args) {
    var a = "WBBWWBBWBW";

    System.out.println(minimumRecolors(a, 7));
  }
}
