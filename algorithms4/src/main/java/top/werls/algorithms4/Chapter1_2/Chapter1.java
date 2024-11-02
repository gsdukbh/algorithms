package top.werls.algorithms4.Chapter1_2;

import edu.princeton.cs.algs4.Picture;
import edu.princeton.cs.algs4.Point2D;

/**
 * Chapter1
 *
 * @author JiaWei Lee
 * @version 1
 * @since on   02 11月 2024
 */
public class Chapter1 {

  public static void main(String[] args) {

    Point2D p1 = new Point2D(0.1, 0.2);

    System.out.println(p1.distanceTo(new Point2D(123, 4)));

    p1.draw();
  }
}
