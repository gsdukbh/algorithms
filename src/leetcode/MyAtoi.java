package leetcode;
import java.util.regex.*;
public class MyAtoi {
    /**
     * 字符串转换整数
     */
    private static int myAtoi(String str) {
        int k=1;
        int j=0;
        int start=0;
        long res=0;
        str = str.trim();
        if (str==null||str.length()==0){
          return 0;
        }
        char first=str.charAt(0);
        if (first == '+'){
            k = 1;
            start ++;
        }
        else if (first == '-'){
            k = -1;
            start ++;
        }
        for (int i=start;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i))){
                return (int) res * k;
            }
            res = res * 10 + (int)str.charAt(i) -'0';
            if (k==1&& res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if (k==-1 && res>Integer.MAX_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int) res * k;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("   +12"));
        System.out.println(myAtoi("   -12"));
        System.out.println(myAtoi(" 2  -12"));
        System.out.println(myAtoi(" ##2  -12"));
        System.out.println(myAtoi("-"));
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("3.114"));
        System.out.println(myAtoi("+-3"));
    }
}
