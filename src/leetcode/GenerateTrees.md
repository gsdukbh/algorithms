## 95.不同的二叉搜索树

### 思路：

因为是二叉搜索树，故左节点比右节点小。可以用这个规则递归的生成二叉树。由`[0,n]`的整数生成的二叉树，在当前选择 根节点为`i`  时，左子树为`[0,i]` 右子树为`[i+1,n]` 分别递归这两个区间。生成不同的二叉树。

[代码](GeneratTree.java)

```java
 public static List<TreeNode> generateTrees(int n) {
        List<TreeNode> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        return generateTrees_(1, n);
    }

    public static List<TreeNode> generateTrees(int l, int r) {
        List<TreeNode> res = new ArrayList<>();
        if (l > r) {
            res.add(null);
            return res;
        }
        for (int i = l; i <= r; i++) {
            List<TreeNode> left = generateTrees(l, i - 1);
            List<TreeNode> righ = generateTrees(i + 1, r);
            for (TreeNode treeNode : left) {
                for (TreeNode treeNode2 : righ) {
                    TreeNode tem = new TreeNode(i);
                    tem.left = treeNode;
                    tem.right = treeNode2;
                    res.add(tem);
                }
            }
        }
        return res;
    }

```

### 思路2：

观察由增长整数二叉树搜索树的生成发现，其实当树只有两个节点时 只用两种状态。

```text
	1        		2				5			6
	 \			   /				 \		   /
   	  2		  	  1					  6		  5
```

利用这个特点，每次新节点都作为root ，或者作为 上一个树的 叶子节点的右节点。

[代码](GeneratTree.java)

```java
	/**
     * 0 <= n <= 8 搜索二叉树
     * 
     * @param n
     * @return List<TreeNode>
     */
    public static List<TreeNode> generateTrees(int n) {
        List<TreeNode> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        // 添加null 增加list长度，以便第一次循环
        res.add(null);
        for (int i = 1; i <= n; i++) {
            List<TreeNode> temp = new ArrayList<>();
            for (TreeNode treeNode : res) {
                // 获取之前所以的子树，并把当前的n 设置为root 节点
                // System.out.println(treeNode);
                // System.out.println(i);
                TreeNode iNode = new TreeNode(i);
                iNode.left = treeNode;
                temp.add(iNode);
                // 插入右子树
                for (int j = 0; j <= n; j++) {
                    TreeNode cNode = clone(treeNode);
                    TreeNode rNode = cNode;
                    // 插入右子树的右子树的右
                    for (int k = 0; k < j; k++) {
                        if (rNode == null) {
                            break;
                        }
                        rNode = rNode.right;
                    }
                    // 跳出循环，为null 无意义
                    if (rNode == null) {
                        break;
                    }
                    TreeNode rTreeNode = rNode.right;
                    iNode = new TreeNode(i);
                    rNode.right = iNode;
                    iNode.left = rTreeNode;
                    temp.add(cNode);
                }
            }
            res = temp;
        }
        return res;
    }

    /**
     * 
     * @param root TreeNode
     * @return new TreeNode
     */
    public static TreeNode clone(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode node = new TreeNode(root.val);
        node.left = clone(root.left);
        node.right = clone(root.right);
        return node;
    }
```

