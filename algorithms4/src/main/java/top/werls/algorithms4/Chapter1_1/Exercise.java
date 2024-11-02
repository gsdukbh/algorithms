package top.werls.algorithms4.Chapter1_1;

/**
 * exercise
 *
 * @author JiaWei Lee
 * @version 1
 * @since on   02 11月 2024
 */
public class Exercise {


  /**
   *  1.1.27
   * 二项分布
   *  100 ,50 ,0.25
   * @param N
   * @param k
   * @param p
   * @return
   */
  public static  double binomial(int N, int k, double p) {
    if ((N == 0) && (k == 0)) {
      return 1.0;
    }
    if ((N < 0) || (k < 0)) {
      return 0.0;
    }
    return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
  }

  public static  double binomial2(int N, int k, double p) {
    double[][] b = new double[N + 1][k + 1];
    b[0][0] = 1.0;
    for (int i = 1; i <= N; i++) {
      b[i][0] = (1.0 - p) * b[i - 1][0];
    }
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= k; j++) {
        b[i][j] = (1.0 - p) * b[i - 1][j] + p * b[i - 1][j - 1];
      }
    }
    return b[N][k];
  }


  public static void main(String[] args) {
    System.out.println(binomial2(100, 50, 0.25));
  }

}
