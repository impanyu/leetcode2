//2.238 Product of Array Except Self
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        if(nums.length==0) return result;
        result[0]=1;
        for(int i=1;i<result.length;i++)
            result[i]=result[i-1]*nums[i-1];
            
        int temp=nums[nums.length-1];
        nums[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            int t=nums[i];
            nums[i]=nums[i+1]*temp;
            temp=t;
        }
        for(int i=0;i<result.length;i++)
            result[i]=result[i]*nums[i];
        return result;
    }
}