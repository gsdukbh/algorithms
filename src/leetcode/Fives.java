package leetcode;

/**
 * @author ：lijiawei
 * @date ：Created in 2019/05/2019/5/29 21:23
 * @description：最长回文子串
 * @version: 1
 */
public class Fives {

    public static void main(String[] args) {
          String s="abacdfgdcaba";
        System.out.println( longestPalindrome(s));
    }

    /**
     * 没有什么暴力解决不了的问题
     * 不过太慢了
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
       String k="";
       String temp="";
       for (int i=0;i<s.length();i++){
           for (int j=i;j<s.length();j++){
               temp=temp+s.charAt(j);
               //反正字符串 
               String fz=new  StringBuilder(temp).reverse().toString();
               if (temp.equals(fz)){
                   k=k.length() > temp.length() ? k :temp ;
               }
           }
           temp="";
       }
        return k;
    }
    public static String longestPalindrome1(String s){
        
        
        return "";
    }
}

