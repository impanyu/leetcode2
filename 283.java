// 2.283 Move Zeros

public class Solution {
    public void moveZeroes(int[] nums) {
        int i,j;
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length-1-i;j++){
                if(nums[j]==0)
                  {
                      int temp=nums[j];
                      nums[j]=nums[j+1];
                      nums[j+1]=temp;
                  }
            }
        }
    }
}