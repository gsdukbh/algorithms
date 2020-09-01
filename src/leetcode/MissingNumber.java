package leetcode;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/31 16:12
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int s :
                nums) {
            sum += s;
        }
        return (nums.length * (nums.length + 1) / 2) - sum;
    }
}
