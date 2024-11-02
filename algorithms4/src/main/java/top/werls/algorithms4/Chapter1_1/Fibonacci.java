package top.werls.algorithms4.Chapter1_1;

/**
 * Fibonacci
 * 1.1.19
 * 斐波那契 递归
 *
 * @author JiaWei Lee
 * @version 1
 * @since on   02 11月 2024
 */
public class Fibonacci {

  public static  long fib(int N) {
    if (N == 0) {
      return 0;
    }
    if (N == 1) {
      return 1;
    }
    return fib(N - 1) + fib(N - 2);
  }

  public static long fib2(int N) {
    if (N == 0) {
      return 0;
    }
    if (N == 1) {
      return 1;
    }
    long[] fib = new long[N + 1];
    fib[0] = 0; // f(0)
    fib[1] = 1;
    for (int i = 2; i <= N; i++) {
      fib[i] = fib[i - 1] + fib[i - 2];
    }
    return fib[N];
  }

  public static void main(String[] args) {
    for (int N = 0; N < 100; N++) {
      System.out.println(N + " " + fib2(N));
    }
  }

}
