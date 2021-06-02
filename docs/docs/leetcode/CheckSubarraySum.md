## [连续的子数组和](https://leetcode-cn.com/problems/continuous-subarray-sum/) 

> ↑ 原题地址



#### 思路

1. 遍历nums数组的子数组，并计算元素和，判断是否与k成倍数关系。

   > 时间复杂度 （$O(n^3)$）

   

   ```java
   class Solution {
       public boolean checkSubarraySum(int[] nums, int k) {
           if(nums.length<2) {
               return false ;
           }
        for (int i = 0; i < nums.length; i++) {
               int sum = 0;
               int count = 0;
               for (int j = i; j < nums.length; j++) {
                   sum += nums[j];
                   count++;
                   if ((count >= 2 && (sum % k) == 0)){
                       return true;
                   }
               }
           }
           return false;
       }
   }
   ```

   

2. 利用哈希存储前缀和，然后计算前缀和的余数。判断他们是否相等，并且子数组大于2.

   - [同余定理](https://zh.wikipedia.org/wiki/%E6%A8%A1%E7%AE%97%E6%95%B8)  若二数的差值*a* − *b*为*n*的整数倍数（若*n*整除*a* − *b*）。数字*n*称为同余关系的模。

     > 即 a - b =c , 则 a mod k = n , b mod k = n ,且 c 是n 的倍数,如 38 - 14= 24 ， k= 12 

   

```java
public static boolean hashMethod(int[] nums, int k) {
        int m = nums.length;
        if (m < 2) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>(16);
        map.put(0, -1);
        int remainder = 0;
        for (int i = 0; i < m; i++) {
            remainder = (remainder + nums[i]) % k;
            if (map.containsKey(remainder)) {
                int prevIndex = map.get(remainder);
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }
        return false;
    }
```

