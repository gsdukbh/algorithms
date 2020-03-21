package leetcode;

/**
 * 有两个容量分别为 x升 和 y升 的水壶以及无限多的水。请判断能否通过使用这两个水壶，从而可以得到恰好 z升 的水？
 * <p>
 * 如果可以，最后请用以上水壶中的一或两个来盛放取得的 z升 水
 * 你允许：
 * 装满任意一个水壶
 * 清空任意一个水壶
 * 从一个水壶向另外一个水壶倒水，直到装满或者倒空
 *
 * @author : LiJiWei
 * @version V1.0
 * @Project: leetcode
 * @Package leetcode
 * @Description: TODO
 * @date Date : 2020年03月21日 21:45
 */
public class CanMeasureWater {

    public static void main(String[] args) {
        System.out.println(3 % 2);
        System.out.println(canMeasureWater(3, 5, 4));
    }

    private static boolean canMeasureWater(int x, int y, int k) {
        if (x + y < k) {
            return false;
        }
        if (x == 0 && y == 0) {
            return k == 0;
        }
//        / by zero
        int a = y == 0 ? GCD(y, x) : GCD(x, y);
        return k % a == 0;
    }

    /**
     * 例子
     * a=3 b=5
     * 3 % 5= 3 , GCD(5,3)
     * 5 % 3= 2 GCD(3,2)
     * 3 % 2= 1 GCD(2,1)
     * return 1
     * 若b不是a的因数 则继续求b,和a除以b的余数的余数
     * @param a a
     * @param b b
     * @return a b 的最大公约数
     */
    private static int GCD(int a, int b) {

        return a % b == 0 ? b : GCD(b, a % b);
    }
}
