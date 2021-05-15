package top.werls.leetcode;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/20 10:14
 */
class UpdateBoardTest {

    @Test
    void updateBoard() {

        char[][] tx = {
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}
        };
        int[] c={3,0};
        tx = UpdateBoard.updateBoard(tx,c);
        for (char[] s:
             tx) {
            System.out.println(Arrays.toString(s));
        }

    }
}