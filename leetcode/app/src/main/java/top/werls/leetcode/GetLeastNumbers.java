package top.werls.leetcode;

import java.util.Arrays;

/**
 * @author : LiJiWei
 * @version V1.0
 * @Project: leetcode
 * @Package leetcode
 * @Description: TODO
 * @date Date : 2020年03月20日 21:17
 */
public class GetLeastNumbers {

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 9, 3, 5, 3, 2, 3, 12, 1};
        System.out.println(Arrays.toString(getLeastNumbers(a, 2)));
    }

    public static int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        } else if (arr.length <= k) {
            return arr;
        }
        sort(arr, 0, arr.length - 1, k);
        int[] res = new int[k];
        System.arraycopy(arr, 0, res, 0, k);

        return res;
    }

    /*只到k  位*/
    private static void sort(int[] a, int lo, int hi, int k) {
        int j = partition(a, lo, hi);
        if (k == j) {
            return;
        } else if (k < j) {
            sort(a, lo, j - 1, k);
        } else {
            sort(a, j + 1, hi, k);
        }

    }

    /*算法4快排切分*/
    private static int partition(int[] a, int lo, int hi) {
        //a[lo...i-1],a[i],a[i+1..hi]
        int i = lo, j = hi + 1;
        int v = a[lo];
        while (true) {
            while (less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static void exch(int[] a, int lo, int j) {
        int tem = a[lo];
        a[lo] = a[j];
        a[j] = tem;
    }

    private static boolean less(int a, int b) {
        return a < b;
    }
}
