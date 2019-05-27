package leetcode;

/**
 * @author ：lijiawei
 * @date ：Created in 2019/05/2019/5/27 14:33
 * @description：寻找两个有序数组的中位数
 * @version: 1
 */
public class Four {
    public static void main(String[] args) {
        int[] ints1={1,3};
        int[] ints2={2,4,6};
        System.out.println(findMedianSortedArrays(ints1,ints2));
       
    }

    
    
    public  static double findMedianSortedArrays(int[] nums1, int[] nums2) {
          int n=nums1.length;
          int m=nums2.length;
          if (n>m){
              return  findMedianSortedArrays(nums2,nums1) ;
          }
          int i=(m+n+1)/2;
          int l=0;
          int r=n;
          while (l<r){
              /**
               * 1 3 
               * 2 4 6
               * 
               */
              int m1=l+(r-l)/2;
              int m2=i-m1;
              if (nums1[m1]<nums2[m2-1]){
                  l=m1+1;
              }
              else {
                  r=m1;
              }
              System.out.println(l);
              System.out.println(r);
          }
         int m1=l;
          int m2=i-l;
          int z1=Math.max(m1<=0 ? Integer.MIN_VALUE:nums1[m1-1],m2<=0 ? Integer.MIN_VALUE:nums2[m2-1]); 
          if ((n+m) % 2==1){
              return z1;
          }
          int z2=Math.min(m1 >=n ? Integer.MAX_VALUE : nums1[m1],m2>=m? Integer.MAX_VALUE : nums2[m2]);
          
        return (z1+z2) * 0.5;
    }

}

