package top.werls.algorithms4.Chapter1;

/**
 * Chapter 1 第一章
 *
 * @author JiaWei Lee
 * @version 1
 * @since on   02 11月 2024
 */
public class Chapter1 {


  public static void main(String[] args) {


  }

  public static  boolean isPrime(int N) {
    if (N < 2) {
      return false;
    }
    for (int i = 2; i * i <= N; i++) {
      if (N % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static  double sqrt(double c) {
    if (c < 0) {
      return Double.NaN;
    }
    double err = 1e-15;
    double t = c;
    while (Math.abs(t - c / t) > err * t) {
      t = (c / t + t) / 2.0;
    }
    return t;
  }

}
