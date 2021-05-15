## 将有序数组转换为二叉搜索树

##### 思路：

二叉搜索树的中序遍历是升序的，可以利用在这个特点。

```java
public static TreeNode sortedArrayToBinarySearchTree(int[] nums) {

        return bfs(0, nums.length - 1, nums);
    }

    public static TreeNode bfs(int left, int right, int[] nums) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = bfs(left, mid - 1, nums);
        node.right = bfs(mid + 1, right, nums);
        return node;
    }
```



