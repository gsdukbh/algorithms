## 递增子序列



##### 思路：递归搜索

从第一个数字开始，把第一个数字放进缓存中，

然后遍历数组，并与缓存中的最后的数比较，把大于的数放进缓存，

当指针遍历到结尾时，判断当前缓存数组中的长度是否大于2，把结果加入答案中。

然后移除缓存中最后一个，完成回溯，在判断当前指针与缓存数组最后一个是否相同，去重。

在进行递归，

```java
public class FindSubsequences {
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> tem = new ArrayList<>();

    public static List<List<Integer>> findSubsequences(int[] nums) {
        dfs(0, Integer.MIN_VALUE, nums);
        return res;
    }

    public static void dfs(int count, int value, int[] nums) {
        if (count == nums.length) {
            if (tem.size() >= 2) {
                res.add(new ArrayList<>(tem));
            }
            return;
        }
        if (nums[count] >= value) {
            tem.add(nums[count]);
//            加
            dfs(count + 1, nums[count], nums);
//            去
            tem.remove(tem.size() - 1);
        }
//去重
        if (nums[count] != value) {
            dfs(count + 1, value, nums);
        }
    }
}
```



