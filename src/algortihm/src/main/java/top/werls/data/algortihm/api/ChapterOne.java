package top.werls.data.algortihm.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.werls.data.algortihm.chapter.one.Text;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Lee JiaWei
 * @date: 2020/7/13 11:21
 */
@RestController
@RequestMapping("/")
public class ChapterOne {

    @GetMapping("/gcd/{p}/{q}")
    public Map<String, Object> gcdApi(@PathVariable Integer p, @PathVariable Integer q) {
        long start = System.currentTimeMillis();
        int tem = Text.gcd(p, q);
        long end = System.currentTimeMillis();

        Map<String, Object> res = new HashMap<>();
        res.put("用时(ms)", end - start);
        res.put("res", tem);
        return res;
    }

    @GetMapping("/fib/{N}")
    public Map<String, Object> fibApi(@PathVariable Integer N) {
        Map<String, Object> res = new HashMap<>();
        long start = System.currentTimeMillis();
        if (N > 92) {
            res.put("res", Text.fib(N));
        }else {
            res.put("res", Text.fibLoop(N));
        }
        long end = System.currentTimeMillis();

        res.put("用时(ms)", end - start);
        return res;
    }

}
