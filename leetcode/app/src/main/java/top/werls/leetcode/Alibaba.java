package top.werls.leetcode;

import java.util.ArrayList;
import java.util.*;

public class Alibaba {

    private static String measureDistance(List<Double> xList, List<Double> yList, double x, double y) {
                double tem_x=0;
                double tem_y=0;
                for (int i=0;i<xList.size();i++){
                    if (xList.get(i)<=x && yList.get(i)<=y){
                        return "yes,0";
                    }
                    if (xList.get(i)>tem_x){
                        tem_x =xList.get(i);
                    }
                    if (yList.get(i)>tem_y) {
                        tem_y = yList.get(i);
                    }
                }
                tem_x=x-tem_x;
                tem_y=y-tem_y;
                int res=0;
                if (tem_x>tem_y){
                    res= (int) tem_x;
                }else {
                    res = (int) tem_y;
                }
                return "no,"+res;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        //(x,y)为小广所在的位置
        double x = Double.parseDouble(line.split(",")[0]);
        double y = Double.parseDouble(line.split(",")[1]);

        line = in.nextLine();
        //xList记录了多边形n个点的x坐标,yList记录了多边形n个点的y坐标
        List<Double> xList = new ArrayList<>();
        List<Double> yList = new ArrayList<>();
        String[] array = line.split(",");
        for(int i = 0; i < array.length; i++) {
            xList.add(Double.parseDouble(array[i]));
            yList.add(Double.parseDouble(array[i+1]));
            i++;
        }
        in.close();
        System.out.println(measureDistance(xList, yList, x, y));
    }

}
