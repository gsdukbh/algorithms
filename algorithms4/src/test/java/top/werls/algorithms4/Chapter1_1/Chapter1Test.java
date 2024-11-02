package top.werls.algorithms4.Chapter1_1;

import junit.framework.TestCase;

/**
 * @author JiaWei Lee
 * @since on   02 11月 2024
 */
public class Chapter1Test extends TestCase {


  public void testTest112() {
    Chapter1.test112();

  }

  public void test119() {
    String s = "";
    int N =5;
    for (int i = N; i > 0; i /= 2) {
      s = (i % 2) + s;
    }
    System.out.println(s);
  }
  public void test1112(){
    int[] a = new int[10];
    for (int i = 0; i < 10; i++) {
      a[i] = 9 - i;
    }
    for (int i = 0; i < 10; i++) {
      a[i] = a[a[i]];
    }
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
  }

  public void test1113(){
    int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
    for (int i = 0; i < a.length; i++) {
      //
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[j][i]);
      }
      System.out.println();
    }
  }

  public void test1114(){
    System.out.println(Chapter1.lg(8));
  }

  public void test1115(){
    int[] a = {1,2,3,4,};
    int[] b = Chapter1.histogram(a, 10);
    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }
  }
  public void test1116(){
    System.out.println(Chapter1.exR1(6));
  }

  public void test1122(){
    int[] a = {1,2,3,4,5,6,7,8,9,10};
    int key = 5;
    System.out.println(Chapter1.BinarySearch(a, key));
  }

  public void  test1122_2(){
    int[] a = {1,2,3,5,6,7,4,5,6,7,8,9,10};
    int key = 6;
    System.out.println(Chapter1.rank2(key, a));
  }

  public void test1124(){
    System.out.println(Chapter1.gcb3(1111111, 1234567,0));
  }

  public void test1126(){
    int a = 1111111;
    int b = 1234567;
    int c =2344;
    int t =233;
    if (a > b) { t = a; a = b; b = t; }
    if (a > c) { t = a; a = c; c = t; }
    if (b > c) { t = b; b = c; c = t; }
    System.out.println(a+" "+b+" "+c);
  }


}