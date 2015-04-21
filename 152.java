//Maximum Product Subarray 2.152
public class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0]; 
        double prevMin=Math.min(0,nums[0]);
        double prevMax=Math.max(0,nums[0]);
        double max=prevMax;
        for(int i=1;i<nums.length;i++){
           if(nums[i]>0){
               prevMin=prevMin*nums[i];
               prevMax=Math.max(prevMax*nums[i],nums[i]);
           }
           else{
               double p=prevMin;
               prevMin=Math.min(prevMax*nums[i],nums[i]);
               prevMax=p*nums[i];
           }
           if(prevMax>max) 
              max=prevMax;
        }
        return (int)max;
    }
}