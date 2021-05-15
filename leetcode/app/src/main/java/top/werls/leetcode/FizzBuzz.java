package top.werls.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/28 17:39
 */
public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        Map<Integer, String> map = Map.of(
                5, "Buzz",
                3, "Fizz"

        );
        for (int i = 1; i <= n; i++) {
            StringBuilder tem = new StringBuilder();
            for (Integer key :
                    map.keySet()) {
                if (i % key == 0) {
                    tem.append(map.get(key));
                }
            }

            if ("".equals(tem.toString())) {
                tem.append(Integer.toString(i));
            }
            res.add(tem.toString());
        }
        return res;
    }
}
