package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/28 14:52
 */
class UpsetArrayTest {

    @Test
    void Test() {
        int[] tes = {1, 2, 3};
        UpsetArray circle = new UpsetArray(tes);
        for (int i = 0; i < 6; i++) {
            System.out.println(Arrays.toString(circle.shuffle()));
        }
        System.out.println(Arrays.toString(circle.reset()));
    }

}