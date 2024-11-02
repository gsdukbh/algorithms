package top.werls.algorithms4.Chapter1_1;

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

  public static void test112() {
    var a = (1 + 2.236) / 2;
    System.out.println(a); //1.618

  }

  public static boolean isPrime(int N) {
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

  public static double sqrt(double c) {
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

  public static int BinarySearch(int[] a, int key) {
    int lo = 0; // 低
    int hi = a.length - 1;
    while (lo <= hi) {
      // 中
      int mid = lo + (hi - lo) / 2;
      if (key < a[mid]) {
        hi = mid - 1;
      } else if (key > a[mid]) {
        lo = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }


  public static int BinarySearch2(int[] a, int key, int lo, int hi) {
    if (lo > hi) {
      return -1;
    }
    // 中
    int mid = lo + (hi - lo) / 2;
    if (key < a[mid]) {
      return BinarySearch2(a, key, lo, mid - 1);

    } else if (key > a[mid]) {
     return BinarySearch2(a, key, mid + 1, hi);
    } else {
      return mid;
    }
  }
  public static int rank(int key, int[] a) {
    return BinarySearch2(a, key, 0, a.length - 1);
  }

  public static int BinarySearch3(int[] a, int key, int lo, int hi,int deep) {
    if (lo > hi) {
      return -1;
    }
    // 中
    int mid = lo + (hi - lo) / 2;
    for (int i = 0; i < deep; i++) {
      System.out.print(" ");
    }
    System.out.println(deep+" lo:" + lo + " hi:" + hi);
    if (key < a[mid]) {
      return BinarySearch3(a, key, lo, mid - 1,deep+1);

    } else if (key > a[mid]) {
      return BinarySearch3(a, key, mid + 1, hi,deep+1);
    } else {
      return mid;
    }
  }

  public static int rank2(int key, int[] a) {
    return BinarySearch3(a, key, 0, a.length - 1,0);
  }


  public static  int gcb(int p,int q){
    if (q == 0) {
      return p;
    }
    int r = p % q;
    return gcb(q, r);
  }

  public static  int gcb2(int p,int q){

    while (q != 0) {
      int r = p % q;
      p = q;
      q = r;
    }
    return p;
  }

  public static  int gcb3(int p,int q,int deep){
    if (q == 0) {
      return p;
    }
    int r = p % q;
    System.out.println(deep+" p:"+p+" q:"+q+" r:"+r);
    return gcb3(q, r,deep+1);
  }



  public static int lg(int N) {
    int product = 1;
    int i = 0;
    while (product <= N) {
      product *= 2; // 2^i = N
      i++;
    }
    return i - 1;
  }

  /**
   * 1.1.15 编写一个静态方法histogram()，接受一个整型数组a[] 和一个整数M 为参数并返回一个大小
   * 为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。如果a[]中的值均在0到M-1 之间，返回数组中所有元素之和应该和a.length 相等。
   *
   * @param a
   * @param M
   * @return
   */
  public static int[] histogram(int[] a, int M) {
    int[] result = new int[M];
    for (int i = 0; i < a.length; i++) {
      if (a[i] < M) {
        int temp = a[i];
        result[temp]++;
      }
    }
    return result;
  }

  public static String exR1(int n) {
    if (n <= 0) {
      return "";
    }
    return exR1(n - 3) + n + exR1(n - 2) + n;
  }

  public static void test1130(){
    boolean[][] a = new boolean[10][10];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = gcb2(i, j) == 1;
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }

}
