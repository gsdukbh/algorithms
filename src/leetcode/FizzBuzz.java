package leetcode;

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
                3, "Fizz",
                5, "Buzz"
        );
        for (int i = 1; i <= n; i++) {
            String tem = "";
            for (Integer key :
                    map.keySet()) {
                if (i % key == 0) {
                    tem += map.get(key);
                }
            }

            if ("".equals(tem)) {
                tem +=Integer.toString(i) ;
            }
            res.add(tem);
        }
        return res;
    }
}
