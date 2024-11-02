package top.werls.algorithms4.Chapter1_2;

/**
 * Accumulator 累加器的方差
 *
 * @author JiaWei Lee
 * @version 1
 * @since on   02 11月 2024
 */
public class Accumulator {

  private double m;
  private double s;
  private int N;

  public void addDataValue(double x) {
    N++;
    s = s + 1.0 * (N - 1) / N * (x - m) * (x - m);
    m = m + (x - m) / N;
  }

  public double mean() {
    return m;
  }

  public double var() {
    return s / (N - 1);
  }

  public double stddev() {
    return Math.sqrt(this.var());
  }
}
