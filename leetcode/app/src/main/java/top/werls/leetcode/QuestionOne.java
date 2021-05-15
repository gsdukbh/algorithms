package top.werls.leetcode;

import java.util.HashMap;
import java.util.Map;

public class QuestionOne {
    /**
     * leetcode 俩数之和
     * @param args
     */
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
       int[] test= twoSum(nums,target);
       for (int test1:test) {
           System.out.println(test1);
       }
       int[] test2=twoSum2(nums,target);
       for (int test1:test2) {
           System.out.println(test1);
       }
    }
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new  int[] {-1,-1};
    }
    static int[] twoSum2(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
            int Test=target-nums[i];
            if (map.containsKey(Test)){
                return new int[] {i,map.get(Test)};
            }
        }
        return new  int[] {-1,-1};
    }
}
