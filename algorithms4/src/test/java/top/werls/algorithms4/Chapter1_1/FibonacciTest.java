package top.werls.algorithms4.Chapter1_1;

import static top.werls.algorithms4.Chapter1_1.Fibonacci.fib;

import junit.framework.TestCase;

/**
 * @author JiaWei Lee
 * @since on   02 11月 2024
 */
public class FibonacciTest extends TestCase {

  public void testFib() {
      for (int N = 0; N < 100; N++) {
          System.out.println(N + " " + fib(N));
      }
  }
}