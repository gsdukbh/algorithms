package top.werls.leetcode;


import java.util.*;
public class Alibaba1 {
    /**
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int n = Integer.parseInt(line);
        int[][] area = new int[n][n];

        for (int i = 0; i < n; i++) {
            line = scanner.nextLine();
            String[] split = line.split(",");
            if (split.length != n) {
                throw new IllegalArgumentException("错误输入");
            }
            int j = 0;
            for (String num : split) {
                area[i][j++] = Integer.parseInt(num);
            }
        }

        int minimumTimeCost = getMinimumTimeCost(n,area);
        System.out.println(minimumTimeCost);
    }

    /** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    private static int getMinimumTimeCost(int n, int[][] area) {
        int temx=0,temy = 0;
        int res=0;
        int min=area[0][0];
        for(int i=1;i<n;i++){
            if (area[0][i]<min){
                min=area[0][i];
                temy=i;
            }
        }

      return get(n,area,temx,temy,res);
    }
    private static int get(int n, int[][] area,int x,int y,int res){
        int temy=0;
        for (int i=y-1;i<y+1;i++){
            int min=area[x][i];
            if (area[x][i]<min){
                min=area[x][i];
                temy=i;
            }
        }
        while (x !=n){
            if (area[x][y]<area[x+1][y]){
                res=get(n,area,x+2,y,res);
            }
            else  {
                res=get(n,area,x+1,temy,res);
            }
        }
        return res;
    }

}
