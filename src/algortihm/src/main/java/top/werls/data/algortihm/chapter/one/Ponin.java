package top.werls.data.algortihm.chapter.one;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;

import java.util.Stack;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: data
 * @Date : 2020/7/23 17:21
 */
public class Ponin {


    public static void main(String[] args) {
        double xlo=.2,xhi=.5,ylo=.5,yhi=.6;
        int T=1000;
        Interval1D xInterval1D=new Interval1D(xlo,xhi);
        Interval1D yInterval1D=new Interval1D(ylo,yhi);
        Interval2D box=new Interval2D(xInterval1D,yInterval1D);
        box.draw();

        Counter counter=new Counter("hin") ;
        for (int i=0;i<T;i++){
            double x=Math.random();
            double y=Math.random();
            Point2D point2D=new Point2D(x,y);
            if (box.contains(point2D)){
                counter.increment();
            }else {
                point2D.draw();
            }
        }
        System.out.println(box.area());
    }
}
