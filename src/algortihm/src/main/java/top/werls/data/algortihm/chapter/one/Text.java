package top.werls.data.algortihm.chapter.one;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Lee JiaWei
 * @date: 2020/7/13 9:54
 */
public class Text {

    public static int gcd(Integer p, Integer q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    public static long fibLoop(int num) {
        if (num < 1) {
            return 0;
        }
        long a = 1;
        long b = 1;
        long temp;
        for (int i = 3; i <= num; i++) {
            temp = a;
            a = b;
            b += temp;
        }
        return b;
    }

    public static BigDecimal fib(Integer n) {
        List<BigDecimal> list = new ArrayList<>();
        list.add(BigDecimal.ZERO);
        list.add(BigDecimal.ONE);
        return fib(n, list);
    }

    public static BigDecimal fib(Integer N, List<BigDecimal> list) {
        if (N < 0) {
            return list.get(0);
        }
        if (list.size() <= N) {
            list.add(fib(N - 1,list).add(fib(N - 2,list)));
        }
        return list.get(N);
    }
}
