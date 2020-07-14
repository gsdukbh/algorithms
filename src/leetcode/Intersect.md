## [两个数组的交集 II](https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/)



### 思路

先遍历长度较小的数组，用一个数组保持数字出现的次数。

在遍历第二数组，与之比较将重复的数字保存到新数组里面，然后返回结果。

[代码](src/leetcode/Instersect.java)

```java
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num :
                nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] res = new int[nums1.length];
        int index = 0;
        for (int num :
                nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                res[index++] = num;
                count--;
            }
            if (count > 0) {
                map.put(num, count);
            } else {
                map.remove(num);
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }
}

```

