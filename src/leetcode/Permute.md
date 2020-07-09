## 46.全排序

给定一个没有**重复数字**的序列，返回所有的排列。

实例：

```txt
输入: [1,1,2]
    输出:
 	 * //  [1,2,3],
     * //  [1,3,2],
     * //  [2,1,3],
     * //  [2,3,1],
     * //  [3,1,2],
     * //  [3,2,1]
```

[代码](src\leetcode\Permute.java) :

```java
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, nums, 0, nums.length);
        return res;
    }

    public  void dfs(List<List<Integer>> res, int[] num, int first, int last) {
        if (first == last) {
            List<Integer> temp=new ArrayList<>();
            for (Integer integer : num) {
                temp.add(integer);
            }
            res.add(temp);
        }
        for (int i = first; i < last; i++) {

            int temp = num[first];
            num[first] = num[i];
            num[i] = temp;

            dfs(res,num, first + 1, last);

            int recover = num[first];
            num[first] = num[i];
            num[i] = recover;
        }
    }
}
```

