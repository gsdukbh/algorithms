package top.werls.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] iin = { 4, 1, 2, 1, 2 };
        System.err.println(singleNumber(iin));
    }

    /**
     * a^b^b=a = b^a^b= a
     * 
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int si = 0;
        for (int i : nums) {
            si ^= i;
        }
        return si;
    }

    public int singleNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            count = count == null ? 1 : ++count;
            map.put(i, count);
        }
        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

}