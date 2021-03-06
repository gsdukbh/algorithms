package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Thirteen {
    /**
     * 罗马数字转整数
     *  使用hash表来映射
     *  判别字符
     */
    public  int romanToInt(String s) {
        int sum = 0;
        Map<String, Integer> map=new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        int len=s.length();
        for (int i=0 ;i<len;){
            if ((i + 1)< len && map.containsKey(s.substring(i,i+2)) ){
                sum += map.get(s.substring(i,i+2));
                i+=2;
            }
            else {
                sum += map.get(s.substring(i, i+1));
                i++;
            }
        }
        return sum;
    }


}
