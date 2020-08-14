package top.werls.data.algorithms.chapter.one;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: data
 * @Date : 2020/7/27 17:44
 */
@SpringBootTest
class StringToolsTest {

    @Test
    void isPalindrome() {
    }

    @Test
    void fileExtensionName() {
    }

    @Test
    void fileBaseName() {
    }

    @Test
    void isSorted() {
    }

    @Test
    void infixRe() {
    }

    @Test
    void toPostfix() {
        String  string="3+4*2";
        System.out.println(StringTools.toPostfix(string));
    }
}