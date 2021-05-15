package top.werls.leetcode;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/28 10:40
 */
public class JudgeCircle {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char i : moves.toCharArray()) {
            switch (i) {
                case 'U':
                    x++;
                    break;
                case 'D':
                    x--;
                    break;
                case 'L':
                    y++;
                    break;
                case 'R':
                    y--;
                    break;
                default:
                    break;
            }
        }
        return x == 0 && y == 0;
    }

    public boolean judgeCircle1(String moves) {
        int[] count = new int[26];
        for (char i : moves.toCharArray()) {
            count[i - 'A']++;
        }
        return count['L' - 'A'] == count['R' - 'A'] && count['U' - 'A'] == count['D' - 'A'];
    }
}
