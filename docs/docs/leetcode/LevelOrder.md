## 二叉树的层序遍历

##### 思路：

BFS搜索的过程中就是按层次的路径进行的，但是返回的结果是中序遍历。并不知道层次的分布。修改BFS搜索的过程。

```java
public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
//        bfs
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> layer = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                assert node != null;
                layer.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(layer);
        }
        return res;
    }
```



