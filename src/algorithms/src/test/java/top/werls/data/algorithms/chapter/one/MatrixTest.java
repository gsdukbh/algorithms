package top.werls.data.algorithms.chapter.one;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: data
 * @Date : 2020/7/22 11:20
 */

@SpringBootTest
class MatrixTest {

    @Test
    void dot() {
//        double[] x = {1, 3, -5}, y = {4, -2, -1};
//        System.out.println(Matrix.dot(x, y));
        String v="1+2)*3-4)*5-6)))";
        System.out.println(StringTools.infixRe(v));
    }

    @Test
    void mult() {
        double[][] a = {
                {3, 5},
                {1, 2}
        }, b = {
                {4},
                {1}
        };
        for (double[] in :
                Matrix.mult(a, b)) {
            System.out.println(Arrays.toString(in));
        }
    }

    @Test
    void transpose() {
        double[][] a = {
                {1, 0, 2},
                {-1, 3, 1}
        };
        for (double[] in :
                Matrix.transpose(a)) {
            System.out.println(Arrays.toString(in));
        }
    }

    @Test
    void testMult() {
        double[][] a = {
                {3, 5},
                {1, 2}
        };
        double[] x = {4, 1};
        System.out.println(Arrays.toString(Matrix.mult(a, x)));
    }

    @Test
    void testMult1() {
        double[][] a = {
                {3, 3, 1},
                {4, 7, 15},
                {0, 9, 15}
        };
        double[] y = {5, 7, 20};
        System.out.println(Arrays.toString(Matrix.mult(y, a)));
    }
}