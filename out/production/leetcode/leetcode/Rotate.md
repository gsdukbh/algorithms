## 旋转数组

给定一个数组，将数组中的元素向右移动 *k* 个位置，其中 *k* 是非负数。

##### 思路：

暴力；直接向前移动

[代码](Rotate.java)

```java
public static void rotate(int[] nums, int k) {
        int temp, pr;
        int length = nums.length;
        for (int i = 0; i < k; i++) {
            pr = nums[length - 1];
            for (int j = 0; j < length; j++) {
                temp = nums[j];
                nums[j] = pr;
                pr = temp;
            }
        }
    }

```



2. 特点   移动后的位置`(i+k)%num.length`

```java
public void rotate1(int[] nums, int k) {
        int length = nums.length;
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[(i + k) % length] = nums[i];
        }
        for (int i = 0; i < length; i++) {
            nums[i] = temp[i];
        }
    }
```

   

3 数据结构 环概念

```java
public void rotate2(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        int count = 0;
        for (int start = 0; count < length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
```



