//2.162 Find Peak Element
public class Solution {
    public int findPeakElement(int[] nums) {
       if(nums.length==1) return 0;
       return findPeak(nums,0,nums.length-1);
    }
    
    public int findPeak(int[] nums,int a,int b){
     if(b<a ) return -1;
     int mid=a+(b-a)/2;
     if(mid==0 || mid==nums.length-1){
        if(mid==0  && nums[mid]>nums[mid+1])  return mid;
        if(mid==nums.length-1 && nums[mid]>nums[mid-1]) return mid;
         
     }
     else{
        if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
     }
        int left=findPeak(nums,a,mid-1);
        if(left!=-1) return left;
        return findPeak(nums,mid+1,b);
    }
}