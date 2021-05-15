## 合并两个有序数组



##### 思路：双指针排序。

```java
public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = 0, r = 0, len = 0;
        int[] nums = new int[m + n];
        System.arraycopy(nums1, 0, nums, 0, m);
        while (l < m && r < n) {
            nums1[len++] = (nums[l] < nums2[r]) ? nums[l++] : nums2[r++];
        }
        if (l < m) {
            while (l < m) {
                nums1[r+l] = nums[l++];
            }
        }
        if (r < n) {
            while (r < n) {
                nums1[l+r] = nums2[r++];
            }
        }
    }
```



##### 思路： 合并数组，再排序。

```java
public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = 0;
        while (l < n) {
            nums1[m + l] = nums2[l++];
        }
        for (int i = 0; i < m + n; i++) {
            for (int j = i; j < m + n; j++) {
                if (nums1[i] > nums1[j]) {
                    int tem = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = tem;
                }
            }
        }
    }
```



```java
  public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
```

