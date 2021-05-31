## 47.全排序 Ⅱ

给定一个可包含重复数字的序列，返回所有不重复的全排列。

实例：

```txt
 输入: [1,1,2]
     输出:
     [
       [1,1,2],
       [1,2,1],
       [2,1,1]
     ]
```

代码：

```java
public class PermuteUnique {
    /**
     * //给定一个可包含重复数字的序列，返回所有不重复的全排列。
     * //
     * // 示例:
     * //
     * // 输入: [1,1,2]
     * //输出:
     * //[
     * //  [1,1,2],
     * //  [1,2,1],
     * //  [2,1,1]
     * //]
     * // Related Topics 回溯算法
     * // 👍 339 👎 0
     *
     * @param nums
     * @return list
     */
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        dfs(nums, 0);
        return ans;
    }

    private void dfs(int[] nums, int cur) {
        if (cur == nums.length) {
            List<Integer> line = new ArrayList<>();
            for (int i : nums) {
                line.add(i);
            }
            ans.add(line);
        } else {
            for (int i = cur; i < nums.length; i++) {
                if (canSwap(nums, cur, i)) {
                    swap(nums, cur, i);
                    dfs(nums, cur + 1);
                    swap(nums, cur, i);
                }
            }
        }
    }

    private boolean canSwap(int nums[], int begin, int end) {
        for (int i = begin; i < end; i++) {
            if (nums[i] == nums[end]) {
                return false;
            }
        }
        return true;
    }

    private void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
```

