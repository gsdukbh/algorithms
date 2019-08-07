package leetcode;

public class MyPow {
    /**
     * 实现 指数乘法
     */
    public double myPow(double x, int n) {
         if (n==0){
             return 1.0;
         }
         return pow(x,n);
    }

    private double pow(double x, int n){
        double r=1;
        for (int i =n;i !=0; i/=2){
            if (i % 2 !=0){
                r *=x;
            }
            x *= x;
        }
        return n>0 ? r : 1/r ;
    }

}
