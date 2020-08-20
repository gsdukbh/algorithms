package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/19 15:57
 */
class CountSubstringsTest {

    @Test
    void countSubstrings() {
        String s="abc";
        CountSubstrings.countSubstrings(s);
        System.out.println(CountSubstrings.countSubstrings(s));
    }

    @Test
    void countSubstringsMana() {
        String s="abc";
        System.out.println(CountSubstrings.countSubstringsMana(s));
    }
}