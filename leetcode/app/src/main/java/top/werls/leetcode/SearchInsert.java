package top.werls.leetcode;

/**
 * @author: Lee JiaWei
 * @date: 2020/7/17 9:21
 */
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        /**
         * 二分
         */
        int high = nums.length -1;
        int low = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return low;
    }
    public int searchInsert2(int[] nums, int target){
        return rank(nums,0,nums.length-1,target);
    }
    public  int rank(int[]nums,int low,int high,int key){
        int mid=(low+high)/2;
        if (low<high){
            return low;
        }
        if (key< nums[mid]){
            return rank(nums,low,mid-1,key);
        }else if (key>nums[mid]){
            return rank(nums,mid+1,high,key);
        }else {
            return mid;
        }
    }
}
