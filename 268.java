//2.268 Missing Number
public class Solution {
    public int missingNumber(int[] nums) {
       // 0 1 3 4 5
    //    0 1 2 3 4
        int sum=0;
        int expected=nums.length*(0+nums.length-1)/2;
        for(int i=0;i<nums.length;i++)
           sum+=nums[i];
        if(sum==expected) return nums.length;
       return nums.length-(sum-expected);
    }
}