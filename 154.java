//Find Minimum in Rotated Sorted ArrayII 2.154
public class Solution {
    public int findMin(int[] nums) {
        int size=nums.length;
       if(size==0) return -1;
       int l=0;
       int r=size-1;
       if(nums[l]<nums[r])  return nums[l];
       while(l<r){
          if(nums[l]==nums[r]){ 
              l++;
              continue;
          }
          int mid=(l+r)/2;
          if(nums[mid]<=nums[r]) r=mid;
          else l=mid+1;
       }
       return nums[l];
      }
    }