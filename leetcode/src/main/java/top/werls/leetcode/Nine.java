package top.werls.leetcode;

public class Nine {
    /**
     * 回文数
     */
    public boolean isPalindrome(int x) {
        int to=0;
        if(x<0) {return false;}
        while (x>to){
            to=to*10+x %10;
            x/=10;
        }
        return x==to||x==to/10;
    }
}
