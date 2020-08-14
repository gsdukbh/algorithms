## 只出现一次的数字

给定一个**非空**整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

##### 思路：

1  利用哈希表。

[代码](SingleNumber.java)

```java
    public int singleNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            count = count == null ? 1 : ++count;
            map.put(i, count);
        }
        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }
```

2 异或    

```java
    /**
     * a^b^b=a = b^a^b = a
     * 
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int si = 0;
        for (int i : nums) {
            si ^= i;
        }
        return si;
    }
```

