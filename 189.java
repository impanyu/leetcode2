//Rotate Array 2.189
public class Solution {
    public void rotate(int[] nums, int k) {
        int tmp=nums[0];
        int end=0;
        int s=nums.length;
        int i=0;
        i=(i-k)%s; 
        i=(i<0)?s+i:i;
        int count=2;
        while(count<=s){
           nums[(i+k)%s]=nums[i];
           i=(i-k)%s; 
           i=(i<0)?s+i:i;
           // a new cycle begins
           if(i==end){
             nums[(i+k)%s]=tmp;
             i=(i+1)%s; 
             tmp=nums[i];
             end=i;
             i=(i-k)%s; 
             i=(i<0)?s+i:i;
             count++;
           }
           count++;
        }
    }
}