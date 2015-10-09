//2.209 Minimum Size Subarray Sum
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int i=0;
        int j=0;
        if (nums.length==0) return 0;
        int min=nums.length+1;
        int current=nums[0];
        while(true){
           if(current<s){
             if(j<nums.length-1){
             j++;
             current+=nums[j]; 
            }
             else break;
           }
           else{
               min=Math.min(min,j-i+1);
              if(i<j){
                 current-=nums[i]; 
                 i++;
              }
              else if(j<nums.length-1){ 
                  j++;
                  i++;
                  current=nums[i];
              }
              else break;
           }
        }
        return min==nums.length+1?0:min;
    }
}