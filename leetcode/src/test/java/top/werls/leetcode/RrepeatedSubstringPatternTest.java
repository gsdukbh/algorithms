package top.werls.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/24 15:21
 */
class RrepeatedSubstringPatternTest {
    String tex = "abab";


    @Test
    void repeatedSubstringPattern() {
        System.out.println(RrepeatedSubstringPattern.repeatedSubstringPattern(tex));
    }

    @Test
    void repeatedSubstringPattern1() {
        System.out.println(RrepeatedSubstringPattern.repeatedSubstringPattern1(tex));
    }
}