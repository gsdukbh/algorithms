package top.werls.data.algortihm.chapter.one;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: data
 * @Date : 2020/7/24 11:26
 */
@SpringBootTest
class RationalTest {

    @Test
    void plus() {
        Rational rational=new Rational(1,2);
        System.out.println(rational.plus(rational).toString());
    }

    @Test
    void minus() {
        Rational rational=new Rational(1,2);
        System.out.println(rational.minus(rational).toString());
    }

    @Test
    void times() {
        Rational rational=new Rational(1,2);
        System.out.println(rational.times(rational).toString());
    }

    @Test
    void testEquals() {
        Rational rational=new Rational(1,2);
        System.out.println(rational.equals(rational));
    }

    @Test
    void testToString() {
        Rational rational=new Rational(1,2);
        System.out.println(rational.toString());
    }

    @Test
    void divides() {
        Rational rational=new Rational(1,2);
        System.out.println(rational.divides(rational).toString());
    }
}