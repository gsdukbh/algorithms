## 存在重复元素

判断在一堆数组中是否出现重复元素。

##### 思路 ：

1 排序后判断。



```java
public static boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
```



2 使用哈希表保存搜索过的记录



```java
public static boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for (int i : nums) {
            if (map.contains(i)) {
                return true;
            } else {
                map.add(i);
            }
        }
        return false;
    }
```

